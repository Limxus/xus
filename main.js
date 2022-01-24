const fs = require("fs");
function fileList(forder) {
    return fs.readdirSync(forder);
}

const postList = fileList("blog");

console.log(postList);
console.log(postList[1]);

var i = 0;
while (i < postList.length) {
    console.log(postList[i]);
    i = i + 1;
}