Reverse - reverse loop 

reverse number - rev = rev*10+ ld and divide 

palindrome - reverse loop with if else 

nonrepeating char - for loop or hashmap( char ch = str.charAt(i);) then if else 

longesrCommonprefix  = > ArraysSort , str[0] , str[str.length-1] index = 0 ; and whilel and return statement;

Duplicate char -> char[] arr = str.toCharArray(); and stringbuilder and compare both loop and append(sb1)

String Compression --> count = 0 and res = " "  with for loop  for(let i = 0 ; i<str.length;i++){
    count++; if(str[i] != str[i+1]){ res += str[i]+count; count = 0;}

String Decomp -->   for(let i = 1; i<str.length ; i+=2 ){
    let num = +(str[i])
    for(let j = 0 ; j<num ; j++){
        res += str[i-1]
    }
}
const characters = (str) => {
    let charcount = {};
    for(let char of str){
        if(charcount[char]){
            charcount[char] += 1;
        }else{
            charcount[char] = 1;
        }
    }
    return charcount
}
console.log(characters('deveshgoek'))
