import java.util.HashMap;

public class LengthEncoding {
    public static String ReturntheString(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int count=1;
        char alpha=s.charAt(0);

        for(int i=1;i<n;i++){
            char ch=s.charAt(i);
            if(ch==alpha){
                count++;
            }else{
                sb.append(alpha).append(count);
                count=1;
                alpha=ch;
            }
        }

        sb.append(alpha).append(count);
        return sb.toString();
       
    }

    public static void main(String[] args){
        String s="aaabbbbeeeeddddd";
        String result=ReturntheString(s);
        System.out.println(result);
    }
}
