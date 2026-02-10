public class butterflya {

    public static void butterfly_pattern(int n) {
        //1st half
        for(int i = 1;i<=n ; i++){
            //stars - i
            for(int j = 1 ; j<=i; j++){
                System.out.print("*"); // stars - i
            }
            //spaces - 2(n-i)
            for(int j = 1  ; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n ; i>=1 ;i--){
            //stars - i
            for(int j = 1 ; j<=i; j++){
                System.out.print("*"); // stars - i
            }
            //spaces - 2(n-i)
            for(int j = 1 ; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println(); // new line after each row
        }
    }
    public static void main(String[] args) {
         butterfly_pattern(4);
    }
}
