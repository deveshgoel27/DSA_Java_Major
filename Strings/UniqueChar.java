public class UniqueChar {
    public static void main(String[] args) {
        String str = "leetlovecode";

         int[] count = new int[26];
         for(char ch: str.toCharArray())
         count[ch-'a']++;

         for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(count[ch-'a'] == 1){
                System.out.println(i); // print the index of first unique char
                return;
            }
         }
         
        System.out.println(-1); // if no unique char found
   }
}
