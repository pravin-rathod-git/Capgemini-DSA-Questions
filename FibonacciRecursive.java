// Program to find Fibonacci number using recursion
public class FibonacciRecursive {

    // Recursive method to find nth Fibonacci number
    public static int findFibonacci(int n) {
        // Base cases
        if (n == 0) return 0;  // 0th Fibonacci = 0
        if (n == 1) return 1;  // 1st Fibonacci = 1

        // Recursive relation:
        // fib(n) = fib(n-1) + fib(n-2)
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    // Main method
    public static void main(String[] args) {
        int n = 7; // Example input

        System.out.println("Fibonacci number at position " + n + " is: " + findFibonacci(n));
    }
}
