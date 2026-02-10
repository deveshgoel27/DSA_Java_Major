public class MaxAndMInElements {
    public static void main(String[] args) {

        int[] arr = {5, 1, 9, 2, 7};
        int min = arr[0], max = arr[0];

        for(int i = 1 ; i<arr.length; i++){
           if(arr[i] > max){
            max = arr[i];
           }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        //2nd approach
        for(int num : arr){
            if(num<min) min = num; 
            if(num>max) max = num;
        }
        System.out.println("Min: " +  min + " Max: " +  max);
    }
}
