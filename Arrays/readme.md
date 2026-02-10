Max ANd MIn => int min = arr[0], max = arr[0];
        for(int i = 1 ; i<arr.length; i++) if (arr[i] > max) {max = arr[i];}

Duplicate remove ==> Two loop compare i = 0 , j = i+1

Missing number -->  sum 1 nikal sum 2 then sum2-sum1

movezero =>  int count = 0 ; loop if (nums[i] != 0 ){nums[count++] = nums[i]} while(count < nums.length){nums[count++] =0 }


RotateArrayByK  -->  rotate main (3 timees reverse ) then reverse  methof with while loop(start<=emd) and swap

maxSubArray(kadaens) = > int sum = 0 and maxsum = nums[0]    for(int i = 0 ; i<nums.length ; i++)sum = sum + nums[i];if(sum > max_sum){max_sum = sum;}  return max_sum

mergesortedarray -->  int i = m-1 ;
       int j = n-1; 
       int k = m+n-1;

       while (j>=0) {
           if(i>=0 && nums1[i]> nums2[j]){
            nums1[k] = nums1[i];
            i--;
           }else{
            nums1[k] = nums2[j];
            j--;
           }
           k--;}