import java.util.ArrayList;
import java.util.List;

public class MajorityElementNby3 {

    // Method to find all elements occurring more than n/3 times
    public static List<Integer> findMajorityElements(int[] numbers) {
        
        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 1; // Initialize with different values

        // Phase 1: Find potential candidates
        for(int num : numbers) {
            if(num == candidate1) {
                count1++;
            }
            else if(num == candidate2) {
                count2++;
            }
            else if(count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Phase 2: Verify the candidates
        count1 = 0;
        count2 = 0;

        for(int num : numbers) {
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
        }

        // Store valid majority elements
        List<Integer> result = new ArrayList<>();

        if(count1 > numbers.length / 3) result.add(candidate1);
        if(count2 > numbers.length / 3) result.add(candidate2);

        return result;
    }

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 2, 2, 1, 1};

        List<Integer> result = findMajorityElements(numbers);

        System.out.println("Elements occurring more than n/3 times: " + result);
    }
}
