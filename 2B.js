const n = parseInt(prompt("Enter the size of the array: "));
var arr = [];
console.log("Enter the array elements: ");
for (let i = 0; i < n; i++) {
    arr.push(parseInt(prompt()));
}
for (let i = 0; i < (n-1); i++) {
    for (let j = (i+1); j < n; j++) {
        if (arr[i] < arr[j]) {
            let temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
console.log("After sorting the elements in descending order: ");
for (let i = 0; i < n; i++) {
    console.log(arr[i]);
}
