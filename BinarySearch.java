public class BinarySearch {
    public static boolean Search(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;

        boolean isPresent=false;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                isPresent=true;
                break;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return isPresent;

    }

    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,80};
        int target=50;
        if(Search(arr, target)){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }
    }
}
