public class Reverse {
   // public static void main(String [] args){
   //    String str = "Devesh";
   //    String revstr = "";
   //    for(int i = str.length()-1 ; i>= 0 ; i--){
   //       revstr += str.charAt(i);
   //    }
   //    System.out.println(revstr);
   // }

         // print the reverse number
         // public static void main(String[] args) {
        
      //       int n = 1200;
        
      //      while(n>0){
      //       int ld = n%10;
      //       System.out.print(ld);
      //       n /=10;
      //      }
      //       System.out.println();
      //   }
        
        // print the given number 
        
             public static void main(String[] args) {
                int n = 1200;
                int rev = 0;
        
              while(n>0){
                 rev =  (rev*10) +n%10;
                 n/= 10;
              }
                System.out.println(rev);
             }
}
