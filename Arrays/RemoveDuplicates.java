public class RemoveDuplicates {
   public static void main(String[] args) {
    
    int arr[] = {2,4,5,2,6};
    
    boolean flag = false;

    for(int i= 0 ; i<arr.length ; i++){
        for(int j = i+1 ; j<arr.length ; j++){
            if(arr[i] == arr[j]){
                System.out.println("Duplicate : "+arr[i]);
                flag = true;
            }
        }   
    }
    if(flag == false){
        System.out.println("no element in an array");
    }
   }
}


// class Main {
    
//     public static int duplicate(int []nums){
//         for(int i = 0 ; i< nums.length ; i++){
//             for(int j = i+1 ; j<nums.length ; j++){
//                 if(nums[i] == nums[j]){
//                     return nums[i];
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] nums = {2,4,2,5,6};
//         System.out.println(duplicate(nums));
//     }
// }