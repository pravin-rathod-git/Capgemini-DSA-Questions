import java.util.*;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine()); // number of steps
        String path = sc.nextLine();              // sequence
        
        int level = 0;
        int valleys = 0;
        
        for (int i = 0; i < n; i++) {
            char step = path.charAt(i);
            
            if (step == 'U') {
                level++;
                // If we just came up to sea level from below
                if (level == 0) {
                    valleys++;
                }
            } else { // step == 'D'
                level--;
            }
        }
        
        System.out.println(valleys);
        sc.close();
    }
}
