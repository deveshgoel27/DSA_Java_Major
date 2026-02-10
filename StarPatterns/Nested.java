public class Nested {
    public static void main(String[] args) {
        // star pattern perpendicular
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // }

        // inverted star patter
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= (n - line + 1); star++) { // 4-1+1 = 4 ,, 3-1+1 = 3
                System.out.print("*");
            }
            System.out.println();
        }

        // halfpyramidNUmber
        for (int line = 1; line <= 4; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }

        // characted pyramid
        int number = 8;
        char ch = 'A';
        for (int line = 1; line <= number; line++) {
            for (int charNum = 1; charNum <= line; charNum++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
