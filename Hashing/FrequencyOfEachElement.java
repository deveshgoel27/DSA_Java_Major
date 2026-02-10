import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 9, 7, 7, 1, 4, 5 };

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
               map.put(arr[i],map.get(arr[i])+1);
        } else{
            map.put(arr[i], 1);
        }
    }
        System.out.println("Element | Frequency");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
}
