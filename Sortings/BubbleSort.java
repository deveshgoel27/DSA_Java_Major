public class BubbleSort {
        public static void sort(int arr[]) {
       for(int i = 0 ; i<arr.length-1 ; i++){
        for(int j = 1 ; j< arr.length-i;j++){
            if(arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j]  =  arr[j-1];
                arr[j-1] = temp;
            }}}
    }

    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] =  { 5,4,1,2,3 };

        System.out.println("Unsorted array:");
        printArray(arr);
        sort(arr);
        System.out.println("Sorted array:");
        printArray(arr);

    }
}
