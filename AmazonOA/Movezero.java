package AmazonOA;

import java.util.Arrays;

public class Movezero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        movezero(nums);  // call method (no need to print directly)
        // print final array
        System.out.println(Arrays.toString(nums)); 
    }

    public static void movezero(int[] nums){
        int count = 0 ;

        for(int i = 0 ; i<nums.length;i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        while(count < nums.length){
            nums[count++] = 0;
        }
    }
}
