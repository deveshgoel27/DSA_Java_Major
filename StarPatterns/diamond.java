
public class diamond {

    public static void diamond_star(int n) {
        // uter loop for upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) { // 2*1-1 = 1 star for i=1
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) { // 2*1-1 = 1 star for i=1
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond_star(5);
    }
}
