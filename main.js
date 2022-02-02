const path = require("path");
const fs = require("fs");

const filePath = path.join(__dirname,"blog_md");
const fileList = fs.readdirSync(filePath);
fileList.map(file=>{
    const body = fs.readFileSync(`./blog_md/${file}`, "utf-8")
    console.log(body)
})

console.log(body)

const hljs = require("highlight.js");
const md = require("markdown_it");