import java.util.Scanner;

public class EquationSolver {

    public static int solve(int a, int b) {
        return (a + b) * (a + b) * (a + b);   // (a+b)^3
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: "); // accepted as per question, not used
        int c = sc.nextInt();

        int result = solve(a, b);
        System.out.println("Result = " + result);
    }
}
