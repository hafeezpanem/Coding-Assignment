const string = prompt('enter the string: ');
const arr = string.split(" ");
let finalstr = "";
for(let i = 0;i<arr.length;i++){
    const str = arr[i];
    for(let j = str.length-1;j>=0;j--){
        finalstr = finalstr + str.charAt(j);
    }
    finalstr=finalstr+" ";
}
console.log(finalstr);
