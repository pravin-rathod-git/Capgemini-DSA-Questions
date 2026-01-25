// Program to calculate Factorial using Iterative and Recursive methods
public class Factorial {

    // Iterative method to find factorial
    public static int FindFactorial(int n) {
        // Factorial of 0 is always 1
        if (n == 0) return 1;

        int fact = 1;

        // Loop from 1 to n and multiply values
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        // Return final factorial value
        return fact;
    }

    // Recursive method to find factorial
    public static int FactRecursive(int n) {
        // Base condition: factorial of 0 or 1 is 1
        if (n == 0 || n == 1)
            return 1;

        // Recursive call: n! = n * (n-1)!
        return n * FactRecursive(n - 1);
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        int number = 5; // Example input

        // Calling iterative method
        int iterativeResult = FindFactorial(number);
        System.out.println("Factorial using Iterative Method: " + iterativeResult);

        // Calling recursive method
        int recursiveResult = FactRecursive(number);
        System.out.println("Factorial using Recursive Method: " + recursiveResult);
    }
}
