
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine().toLowerCase();
        sc.close();

       Map<Character,Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char ch : chars){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                map.put(ch, map.get(ch)+1);
            }
        }
        System.out.println(map);
    }
}
