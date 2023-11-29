package BinarySearch;

//Called it bitonic array

//Leetcode 1095 15-2.29hr

//In this que array are given in ascending and then descending =>then cheak the biggest element
//

public class MountainArray {
    public static void main(String[] args) {
        int arr[]={0,1,0};   
        System.out.println(mountainArray(arr));
    }

    public static int mountainArray(int arr[]){
     int start=0;
     int end=arr.length-1;

     while (start<end) {
        int mid=start+(end-start)/2;
         
        if(arr[mid]>arr[mid+1]){
            //You are in descending part now
            //thhis may be the ans , but look at the left
            //this is why end !=mid-1
          end=mid;
        }
        else{
         //you are in ascending order
         start=mid+1;
         //bcoz we know that mid+1 element >mid element
        }
     }

     return end;//return start or end same ans

     //At the end start==end and pointing to the largest no. bcoz of the 2 checks above
     //start and end are always trying to find max element in theabove 2 cheks 
     //hence ,when they are pointing just one element ,this the max one bcoz that is what the checks say
    }
}
