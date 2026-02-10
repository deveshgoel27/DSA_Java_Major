bubble sort --> 2 loops , i = arr.length - 1 ; j = arr.length - i then compare if(arr[j-1]>arr[j]) then swap int temp bnake

selection --> 2 loops i = arr.lenght-1 , j = i+1,, compare smallst > j ,,,then swap .

insertion =>  for(int i = 0 ; i<arr.length ; i++){
        int curr = arr[i];
        int prev = i-1;

        while (prev>= 0 && arr[prev]> curr) {
              arr[prev+1] = arr[prev];
              prev--;           
        }
        arr[prev+1] = curr;
      }

binary search = int start = 0 , end = nums.length- 1; the while loop(start<=end) { mid nikal l then if cnctn mid == key return mid} mid<key start = mid+1 else end = mid-1;

Rotated Search Array -->   // ✅ check if left half is sorted
            if (nums[start] <= nums[mid]) {
                if (key >= nums[start] && key < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
        
            // ✅ otherwise, right half is sorted
            else {
                if (key > nums[mid] && key <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1; }}