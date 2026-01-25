// Program to check whether a number is Prime
public class PrimeNumber {

    public static boolean FindIsPrime(int n) {

        // Numbers less than or equal to 1 are not prime
        if (n <= 1) return false;

        // 2 is the only even prime number
        if (n == 2) return true;

        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Not prime if divisible
            }
        }

        return true; // Prime if no divisors found
    }

    public static void main(String[] args) {
        int num = 17;

        if (FindIsPrime(num))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is NOT a Prime Number");
    }
}
