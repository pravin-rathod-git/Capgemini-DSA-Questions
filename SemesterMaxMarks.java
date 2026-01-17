import java.util.Scanner;

public class SemesterMaxMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of semester:");
        int sem = sc.nextInt();

        int[] subjects = new int[sem];
        int[][] marks = new int[sem][];

        // Input number of subjects per semester
        for(int i = 0; i < sem; i++) {
            System.out.print("Enter no of subjects in " + (i+1) + " semester:");
            subjects[i] = sc.nextInt();
            marks[i] = new int[subjects[i]];
        }

        // Input marks semester-wise
        for(int i = 0; i < sem; i++) {
            System.out.print("Marks obtained in semester " + (i+1) + ":");
            for(int j = 0; j < subjects[i]; j++) {
                marks[i][j] = sc.nextInt();

                // Validation
                if(marks[i][j] < 0 || marks[i][j] > 100) {
                    System.out.println("You have entered invalid mark.");
                    return;
                }
            }
        }

        // Find and print maximum per semester
        for(int i = 0; i < sem; i++) {
            int max = marks[i][0];
            for(int j = 1; j < subjects[i]; j++) {
                if(marks[i][j] > max) {
                    max = marks[i][j];
                }
            }
            System.out.println("Maximum mark in " + (i+1) + " semester:" + max);
        }
    }
}
