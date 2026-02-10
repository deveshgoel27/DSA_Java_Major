
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        
        String str = "AABCBDE";
       for(int i = 0 ; i< str.length() ; i++){
        boolean flag  = true;
           for(int j = 0 ; j <str.length() ; j++){
            if( i!=j && str.charAt(i) == str.charAt(j)){
                flag = false;
                break;
            }
       }
            if (flag) {
                System.out.println("First non-repeated characters is " + str.charAt(i));
                break;
            }
        }
       

        // 2nd way
        // String unique = "AABDCE";
        // for (int i = 0; i < unique.length(); i++) {
        //     for (int j = i + 1; j < unique.length(); j++) {
        //         if (unique.charAt(i) != unique.charAt(j)) {
        //             System.out.println("1st non repeating char is : " + unique.charAt(j));
        //             return;
        //         }
        //     }
        // }

    //     //3rd approach - clctn
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter any String text: ");

    //     String str = sc.nextLine().toLowerCase();
    //     sc.close();

    //     //main logic starts here 

    //      Map<Character,Integer> map = new HashMap<Character,Integer>();
    //      boolean status = false;
    //      for(int i = 0 ; i<str.length() ; i++){
    //         char ch = str.charAt(i);
    //         if(map.get(ch) == null){
    //             map.put(ch,1);
    //         }else{
    //             map.put(ch,map.get(ch)+1);
    //         }
    //      }

    //       // for printing 
    //     for(int i = 0 ; i<str.length();i++){
    //         char ch = str.charAt(i);
    //         if(map.get(ch)==1){
    //             System.out.println("First non repeated character in string is: "+ch);
    //             status = true;
    //             break;
    //         }
    //     } 

       
    //     if(!status){
    //         System.out.println("There is no unique character in the given string text!");
    //     }
    }

}
