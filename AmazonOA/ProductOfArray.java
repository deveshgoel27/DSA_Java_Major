package AmazonOA;

import java.util.Arrays;

public class ProductOfArray{
    
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        System.out.println(Arrays.toString(productofarrayexceptitself(nums)));
    }

    public static int[] productofarrayexceptitself(int[] nums){
        int n = nums.length;
        int ans[] = new int[n];
        int ProdR = 1;
        int ProdL = 1;

        for(int i = n-1; i>=0 ;i--){
              ans[i] = ProdR;  // arr[3] = 1 ;
              ProdR = ProdR * nums[i];  // 1 * 4
        }
        // ans = [24, 12, 4, 1]  


        for(int i = 0 ; i < n ; i++){
            ans[i] = ans[i] * ProdL;  // 24 *1 = 24   12 * 1 = 12 , 4*2=8 , 1*6 = 6;
            ProdL = ProdL * nums[i];    // 1*1 , 1*2 , nums[i] = number , Prod = index ko multiplied 
        }
        return ans;
    }
}