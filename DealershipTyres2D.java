import java.util.Scanner;

public class DealershipTyres2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of dealerships

        int[][] data = new int[n][2]; // [][0] -> cars, [][1] -> bikes
        int[] tyres = new int[n];     // store results

        // Taking all inputs
        for(int i = 0; i < n; i++) {
            data[i][0] = sc.nextInt(); // cars
            data[i][1] = sc.nextInt(); // bikes
        }

        // Calculating tyre count
        for(int i = 0; i < n; i++) {
            int cars = data[i][0];
            int bikes = data[i][1];
            tyres[i] = (cars * 4) + (bikes * 2);
        }

        // Printing final output
        for(int i = 0; i < n; i++) {
            System.out.println(tyres[i]);
        }
    }
}
