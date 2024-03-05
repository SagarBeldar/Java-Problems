package practice;

import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int arr[]={3,1,5,3,7,9,4,6};
                //-------------------------Method 1----------------------
        // Arrays.sort(arr);       
        // System.out.println("Elements of array sorted in ascending order:");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
                //-------------------------Method 2----------------------
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
            //prints the sorted element of the array  
            System.out.print(arr[i]+" ");
           
        }

    }
}
