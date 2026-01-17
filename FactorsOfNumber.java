import java.util.*;
public class FactorsOfNumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i+" ");
                if(i!=n/i){
                    System.out.println(n/i);
                }
            }
        }
    }
}
