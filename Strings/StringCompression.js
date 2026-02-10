let str = "aabbbccaoooo";
//output - "a2b3c2a1o4"

let count = 0;
let result = ""
for(let i = 0 ; i<str.length;i++){
    count++;
    if(str[i] != str[i+1]){
        result += str[i]+count;
        count = 0;
    }
}
console.log(result)


