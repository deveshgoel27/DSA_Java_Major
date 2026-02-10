    public class RotatedSearchArray {

    public static int search(int nums[], int key) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == nums[mid]) return mid;

            // ✅ check if left half is sorted
            if(nums[start] < nums[mid]){
                if(key >= nums[start] && key <= nums[mid]){
                    end = mid-1;
                }else{
                    start  = mid+1;
                }
            }
        
            // ✅ otherwise, right half is sorted
            else{
                if(key < nums[end] && key > nums[mid]){
                    start = mid+1;
                }else{
                    end = mid-1 ;
                }}}
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4, 5, 7, 0, 1, 2, 3};
        int key = 2;
        System.out.println(search(nums, key)); 
    }}
