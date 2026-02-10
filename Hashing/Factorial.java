public class Factorial{
    public static void main(String[] args) {
        int n = 5; 
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}



// factorial(1) → 1

// factorial(2) → 2 * 1 = 2

// factorial(3) → 3 * 2 = 6

// factorial(4) → 4 * 6 = 24

// factorial(5) → 5 * 24 = 120