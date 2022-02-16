const path = require("path");
const fs = require("fs");
const ejs = require("ejs");
const blogLayout = fs.readFileSync("./templates/blogLayout.html", "utf8")

const filePath = path.join(__dirname,"blog_md");
const fileList = fs.readdirSync(filePath);
const blog_main = fs.readFileSync("./templates/blogListLayout.html", "utf8")

const deployFiles = [];

const hljs = require("highlight.js");
const md = require("markdown-it")({
    html: false,
    xhtmlOut: false,
    breaks: false, 
    langPrefix: "language-",
    linkify: true,
    typographer: true,
    quotes: "“”‘’",
    highlight: function(str, lang) {
      if (lang && hljs.getLanguage(lang)) {
        const langL = lang.charAt(0).toUpperCase() + lang.slice(1);
        try {
          return (
           `<h4 class = "langName">${langL}</h4><pre class="hljs"><code>` +
            hljs.highlight(lang, str, true).value +
            "</code></pre>"
          );
        } catch (__) {}
      }
      return (
        '<pre class="hljs"><code>' + md.utils.escapeHtml(str) + "</code></pre>"
      );
    }
  });

const extractBody = text =>{
  return text.replace(/(\+{3})([\s\S]+?)\1/,"");
};

extractValue = text =>{
  const string = text.match(/(\+{3})([\s\S]+?)\1/);
  if (!string){return null;} else{
    const valueLines = string[2].match(/[^\r\n]+/g);
    const values = {};
    if (valueLines){
      valueLines.map(valueLine=>{
        const keyAndValue = valueLine.match(/(.+?)=(.+)/);
        if (keyAndValue){
          const key = keyAndValue[1].replace(/\s/g,"");
          const value = keyAndValue[2].replace(/['"]/g,"").trim();
          values[key] = value;
        }
      });
      return values;
    }
  }
};

fileList.map(file=>{
  const body = fs.readFileSync(`./blog_md/${file}`, "utf-8");
  const converted = md.render(extractBody(body));
  const value = extractValue(body);
  if (value){
    const title = value.title || " ";
    const date = value.date || " ";
    const desc = value.desc || " ";
    const tag = value.tag || "기타";
    const bolgpost = ejs.render(blogLayout,{
      content :converted,
      title, tag, date
    });

    const fileName = file.slice(0, file.indexOf(".")).toLowerCase();
    fs.writeFileSync(`./blog/${fileName}.html`, bolgpost);

    deployFiles.push({ path: `${fileName}.html`, title, date, desc, tag });
    const blog_list = ejs.render(blog_main,{
      lists: deployFiles
    });

    fs.writeFileSync("./web/blog", blog_list);
  }
});

