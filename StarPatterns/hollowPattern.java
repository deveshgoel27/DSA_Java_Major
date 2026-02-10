

public class hollowPattern {

       public static void hollow_rectangle(int totcols, int totrows) {
         // outer-loop for rows
          for(int i = 1 ; i<=totrows ;i++){
            for(int j = 1; j<=totcols ; j++){
                if(i == 1 || i == totrows || j == 1 ||j == totcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // new line after each row
            System.out.println();
          }
       }

    public static void main(String[] args) {
        // Call the method to print a hollow rectangle with 5 columns and 4 rows
        hollow_rectangle(5, 4);
    }
}