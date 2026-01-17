import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print result
        for(int key : map.keySet()){
            System.out.println(key + " occurs " + map.get(key) + " times");
        }
    }
}
