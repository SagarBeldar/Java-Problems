package Recusivefucn;


public class Basic3 {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,8,12,14,25,46,78,90};
        int key=25;
        System.out.println(search(arr, key, 0,arr.length-1));

    }

    static int search(int arr[],int target,int s,int e){
       if(s>e){
        return -1;
       }

       int mid=s+(e-s)/2;

       if(arr[mid]==target){
        return mid;
       }

       if(target<arr[mid]){
        return search(arr, target, s, mid-1);
       }
        return search(arr, target, mid+1, e);
    }
}
