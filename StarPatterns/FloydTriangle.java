

public class FloydTriangle {
    public static void flyod_triangle(int n , int counter){
        //outer loop
        for(int i=1; i<=n ; i++){
            //inner-loop
            for(int j = 1 ; j<=i ; j++){
                // print the number
                System.out.print(counter + " ");
                // increment the counter
                counter++;
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        flyod_triangle(5,1 );
        
    }
}
