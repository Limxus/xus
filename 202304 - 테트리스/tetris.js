const canvas = document.getElementById('main_canvas');
const size = 30;
const ctx = canvas.getContext('2d');
let cTop = 0;
let cLeft = 0;
let canvasTable = [];

let blockArr = [];
let blockX = 0;
let blockY = 0;
let blockColor = "";

let game;

window.onload = run;

document.addEventListener("keydown",function( event ){
	onKeyDown(event);		
});

function setTable (){
    canvasTable = [];
    for(let i = 0; i < 20; i++){
        canvasTable.push(new Array(10));
        for(let j = 0; j < 10; j++){
            canvasTable[i][j] = 0;
        }
    }
}

function onKeyDown(event)
{
	if(event.which==37)	// 왼쪽키
	{
		blockX--;
		if(checkConfilict())blockX++;
		else draw();
	}
	if(event.which==39)	// 오른쪽키
	{
		blockX++;
		if(checkConfilict())blockX--;
		else draw();
	}
	if(event.which==40)	// 아래쪽키
	{
		blockY++;
		if(checkConfilict())blockY--;
		else draw();
	}
    if(event.which==32)	// 스페이스키 
	{
        const SpaceInterval = setInterval(function () {
            draw();
            blockY++;
            if(checkFloor()) clearInterval(SpaceInterval);
        }, 2);
	}
	if(event.which==38)	// 위쪽키(회전)
	{
		blockArr[0].retate();
        if(checkConfilict()) {
            blockArr[0].rollBack();
        }
        draw();
	}
}

function draw() {
    ctx.strokeStyle="#ffff";
    ctx.lineWidth=1;
    ctx.strokeRect(0, 0, canvas.width - 1, canvas.height - 1);  

    for(let i = 0; i < 20; i++){
        for(let j = 0; j < 10; j++){

            ctx.fillStyle = canvasTable[i][j] == 0 ? "#ccc" : "green";
            const b = blockArr[0].getBlock();
            const blockSize = b.length;
            for(let k = 0; k < blockSize; k++){
                for(let kk = 0; kk < b[k].length; kk++){
                    if(b[k][kk] === 0) continue;

                    if(j===blockX+kk && i===blockY+k) ctx.fillStyle = blockColor;
                }
            }

            x = cLeft + j * size;
            y = cTop + i * size;
            ctx.fillRect(x, y, size-2, size-2);
        }
    }
}

function setBlockPosition() {
    const b = blockArr[0];
    blockX = b.getBlockX();
    blockY = b.getBlockY();
    blockColor = b.getBlockColor();
}

function next() {
    blockArr.splice(0, 1);
    setBlockPosition();
    if(checkConfilict()) {
        alert("gameover");
        clearTimeout(game);
    }
}

function setBlocks() {
    for(let i = 0; i < 100; i++){
        const a = Math.floor(Math.random() * (7 - 1 + 1) + 1);
        blockArr.push(createBlock(a));
    }
}

function checkConfilict() {
    let isCheck = false;
    const b = blockArr[0].getBlock();
    const blockSize = b.length;
    for(let k = 0; k < blockSize; k++){
        for(let kk = 0; kk < b[k].length; kk++){
            if(b[k][kk] === 0) continue;
            if(blockX+kk < 0 || blockX+kk >=10 || blockY+k >= 20 || canvasTable[blockY+k][blockX+kk]!=0){
                return true;
            }
        }
    }
    return isCheck;
}

function checkFloor() {
    const b = blockArr[0].getBlock();
    const blockSize = b.length;
    if(checkConfilict()){
        blockY--;
        for(let k = 0; k < blockSize; k++){
            for(let kk = 0; kk < b[k].length; kk++){
                if(b[k][kk] === 0) continue;
                canvasTable[blockY+k][blockX+kk] = 1;
            }
        }
        for(let i = 0; i < 20; i++){
            let isFull = true;
            for(let j = 0; j < 10; j++){
                if(canvasTable[i][j] == 0) isFull = false;
            }
            if(isFull){
                console.log(1);
                for(k=i;k>0;--k){
					for(j=0;j<10;++j){
                        canvasTable[k][j]=canvasTable[k-1][j];
                    }
                }
            }
        }
        next();
        return true;
    }
}

function run() {
    setTable();
    setBlocks();
    setBlockPosition();
    game = setInterval(function () {
        blockY++;
        checkFloor();
        draw();
    }, 600);
}

class Block{
    constructor(block, color){
        this.block = block;
        this.color = color;
    }
    getBlockX = function (){
        return Math.floor(5 - this.block[0].length/2);
    }
    getBlockY = function (){
        return 1;
    }
    getBlockColor = function () {
        return this.color;
    }
    getBlock = function (){
        return this.block;
    }
    retate = function (){
        this.before = this.block;
        const temp = Array.from(Array(this.block.length), () => new Array(this.block[0].length));
        for(let i = 0; i < this.block.length; i++){
            for(let j = 0; j < this.block[i].length; j++){
                temp[j][this.block.length-i-1] = this.block[i][j];
            }
        }
        this.block = temp;
    }
    rollBack = function () {
        this.block = this.before;
    }
}

function createBlock(key) {
    switch (key) {
        case 1: return new Block([
             [0,0,0]
            ,[1,1,1]
            ,[0,1,0]
        ], "blue");
        case 2: return new Block([
            [1,1]
           ,[1,1]
        ], "blue");
        case 3: return new Block([
            [0,1,0,0]
           ,[0,1,0,0]
           ,[0,1,0,0]
           ,[0,1,0,0]
        ], "blue");
        case 4: return new Block([
            [0,0,0]
           ,[0,1,1]
           ,[1,1,0]
        ], "blue");
        case 5: return new Block([
            [0,0,0]
           ,[1,1,0]
           ,[0,1,1]
        ], "blue");
        case 6: return new Block([
            [0,0,0]
           ,[1,0,0]
           ,[1,1,1]
        ], "blue");
        case 7: return new Block([
            [0,0,0]
           ,[1,1,1]
           ,[0,0,1]
        ], "blue");
    }
}