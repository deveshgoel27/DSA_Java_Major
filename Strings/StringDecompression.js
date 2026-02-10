let str = "a2b3c2o4";
//output - "aabbbccoooo"
let res = "";
for(let i = 1; i<str.length ; i+=2 ){
    let num = +(str[i]) // convert string to number
    for(let j = 0 ; j<num ; j++){
        res += str[i-1] // append the character to the result string why str[i-1] because we are skipping the number
    }
}
console.log(res)


