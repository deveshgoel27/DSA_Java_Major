public class MissingNumber {
    public static void main(String[] args) {
    
    int arr[] = {1,2,4,5};

    int sum1 = 0;
    for(int i = 0 ; i<arr.length;i++){ 
       sum1 = sum1+arr[i];  // 1+2+4+5 = 12
    }
    // System.out.println("Sum of elements in array: "+ sum1);

    int sum2 = 0 ; 
    for(int i = 1 ; i<=5 ; i++){  
        sum2 = sum2+i; // 1+2+3+4+5 = 15
    }
    // System.out.println("Sum of elements in array: "+ sum2);

    System.out.println("Missing number is : "+ (sum2-sum1));


    //2 Approach
    int[] array = {1,2,4,5}; // n = 5
        int n = 5;
        int sum = n*(n+1)/2; //15
        int arrSum = 0;
        for(int num : array) 
          arrSum += num;
        System.out.println("Missing number is : " + (sum - arrSum));
}
}
