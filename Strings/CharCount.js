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

