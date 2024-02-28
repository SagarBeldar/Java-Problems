package Recursion;

public class Basic6 {
    static int firstOccurance(int arr[],int key,int i ){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,2,4,7,0,97,4,23};
        int key=97;
        System.out.println(firstOccurance(arr, key,0));
    }
}
