import java.util.HashMap;

// ----------- Basic Approach using HashMap -----------
class BasicApproach {

    // Method to find majority element using HashMap
    public int findMajorityUsingHashMap(int[] numbers) {
        
        int n = numbers.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each element
        for(int num : numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check which element appears more than n/2 times
        for(int key : map.keySet()) {
            if(map.get(key) > n / 2) {
                return key; // Majority element found
            }
        }

        return -1; // No majority element
    }
}


// ----------- Optimal Approach using Boyer-Moore Voting Algorithm -----------
public class MajorityElementFinder {

    // Method to find majority element using voting algorithm
    public static int findMajority(int[] numbers) {
        
        int candidate = 0;
        int count = 0;

        // Phase 1: Find potential candidate
        for(int num : numbers) {
            if(count == 0) {
                candidate = num;
                count = 1;
            }
            else if(num == candidate) {
                count++;
            }
            else {
                count--;
            }
        }

        // Phase 2: Verify candidate
        count = 0;
        for(int num : numbers) {
            if(num == candidate) {
                count++;
            }
        }

        // Check if candidate is actually majority
        if(count > numbers.length / 2) {
            return candidate;
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        
        int[] numbers = {2, 2, 1, 1, 2, 2, 2};

        BasicApproach basic = new BasicApproach();

        // Using HashMap approach
        int result1 = basic.findMajorityUsingHashMap(numbers);
        System.out.println("Majority Element (HashMap): " + result1);

        // Using Voting Algorithm
        int result2 = findMajority(numbers);
        System.out.println("Majority Element (Voting Algorithm): " + result2);
    }
}
