import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        movezero(nums);  // call method (no need to print directly)
        // print final array
        System.out.println(Arrays.toString(nums)); 
    }


    public static void movezero(int[] nums) {
        int count = 0;
        // move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
                 //         i=0 → nums[0]=0 → skip.
                 // i=1 → nums[1]=1 → place at nums[0], now array = {1,1,0,3,12}, count=1.
                 // i=2 → nums[2]=0 → skip.
                 // i=3 → nums[3]=3 → place at nums[1], array = {1,3,0,3,12}, count=2.
                 // i=4 → nums[4]=12 → place at nums[2], array = {1,3,12,3,12}, count=3.
        
        // fill rest with zeros
        while (count < nums.length) {
            nums[count++] = 0;
        } 
        // count=3 → set nums[3]=0, array = {1,3,12,0,12}
        // count=4 → set nums[4]=0, array = {1,3,12,0,0}
    }
}
