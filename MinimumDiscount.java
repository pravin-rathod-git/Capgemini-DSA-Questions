import java.util.*;

public class MinimumDiscount {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());

        String[] names=new String[n];
        int[] discount=new int[n];

        for(int i=0;i<n;i++){
            String line=s.nextLine();
            String[] parts=line.split(",");

            String item=parts[0];
            int amount=Integer.parseInt(parts[1]);
            int dis=Integer.parseInt(parts[2]);

            int discountAmt=(amount*dis)/100;
            names[i]=item;
            discount[i]=discountAmt;
        }

        int minDis=discount[0];

        for(int i=1;i<n;i++){
            if(minDis>discount[i]){
                minDis=discount[i];
            }
        }

        for(int i=0;i<n;i++){
            if(discount[i]==minDis){
                System.out.println(names[i]);
                System.out.println(discount[i]);
            }
        }

        s.close();
    }
}

