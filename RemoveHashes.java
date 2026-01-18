public class RemoveHashes {
    public static String Remove(String s){
        int n=s.length();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            if(s.charAt(i)!='#'){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();

    }

    public static void main(String[] args){
        String s="Hash#mode##on";
        System.out.println(Remove(s));
    }
}
