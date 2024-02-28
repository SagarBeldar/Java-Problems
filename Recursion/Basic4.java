package Recursion;

public class Basic4 {
    
    static boolean sortarr(int arr[],int idx){
        if(idx ==arr.length-1){
            return true;

        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
       return sortarr(arr, idx+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(sortarr(arr,0));
    }
}
