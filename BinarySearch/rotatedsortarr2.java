package BinarySearch;

public class rotatedsortarr2 {
    public static int rotatedsort(int[] arr, int key){
        int low=0;
        int high=arr.length-1;
    
        while (low<=high) {
            int mid=low+(high-low)/2;
    
            if(arr[mid]==key){
                return mid;
            }

            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;high--;
                continue;
            }
             // If the left half is sorted
            if(arr[low]<=arr[mid]){
                if(key>=arr[low] && key<arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            // If the right half is sorted
            else{
                if(key>arr[mid] && key<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
    
    
        return -1;
       }
        public static void main(String[] args) {
            int arr[]={20,10,20,20,30,30,40,50,50,50,60,5,10};
            int key=50;
            int index=rotatedsort(arr,key);
    
            if(index!=-1){
                System.out.println("Key found at "+index);
            }else{
                System.out.println("Key not found");
            }
        }
}
