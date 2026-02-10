import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twosums(nums, 9)));
    }

    public static int[] twosums(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int req_num = target - nums[i];

            if (map.containsKey(req_num)) {
                int[] arr = {
                        map.get(req_num), i
                };
                return arr;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}