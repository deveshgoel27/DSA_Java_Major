public class Fibonacci {
    // Recursive
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibRecursive(n));
    }
    public static int fibRecursive(int n) {
        if(n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
}


// fibRecursive(5)

// fibRecursive(5)
// → fibRecursive(4) + fibRecursive(3)

// fibRecursive(4)
// → fibRecursive(3) + fibRecursive(2)

// fibRecursive(3)
// → fibRecursive(2) + fibRecursive(1)

// fibRecursive(2)
// → fibRecursive(1) + fibRecursive(0)
// → returns 1 + 0 = 1

// fibRecursive(3)
// → 1 (from fib(2)) + 1 (from fib(1)) = 2

// fibRecursive(4)
// → 2 (from fib(3)) + 1 (from fib(2)) = 3

// fibRecursive(5)
// → 3 (from fib(4)) + 2 (from fib(3)) = 5

// ✅ Output = 5



// Explanation:

// Start with a = 0, b = 1 (first two Fibonacci numbers).

// Loop n times:

// Store current a in temp.

// Move a forward (a = b).

// Move b forward (b = temp + b).

// At the end, a will be the nth Fibonacci number.

// Dry Run: fibIterative(5)

// Initial: a=0, b=1

// i=0: temp=0, a=1, b=1

// i=1: temp=1, a=1, b=2

// i=2: temp=1, a=2, b=3

// i=3: temp=2, a=3, b=5

// i=4: temp=3, a=5, b=8

// Loop ends → a = 5

// ✅ Output = 5