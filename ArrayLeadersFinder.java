import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeadersFinder {

    // Method to find all leader elements in the array
    public static ArrayList<Integer> findLeaders(int[] numbers) {
        
        int n = numbers.length;
        ArrayList<Integer> leaders = new ArrayList<>();

        // Last element is always a leader
        int currentLeader = numbers[n - 1];
        leaders.add(currentLeader);

        // Traverse from right to left
        for(int i = n - 2; i >= 0; i--) {
            if(numbers[i] > currentLeader) {
                currentLeader = numbers[i];
                leaders.add(currentLeader);
            }
        }

        // Reverse list to maintain left-to-right order
        Collections.reverse(leaders);

        return leaders;
    }

    public static void main(String[] args) {
        
        int[] numbers = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> result = findLeaders(numbers);

        System.out.println("Leaders in the array: " + result);
    }
}
