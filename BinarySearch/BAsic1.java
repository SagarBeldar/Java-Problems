package BinarySearch;

public class BAsic1 {
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start+ (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4,0,1,3,5,7,9,11,13,15};
        int target=9;

        int ans=binarySearch(arr, target);
        System.out.println(ans);
    }
}
