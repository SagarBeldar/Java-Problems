package Array;

public class binarysearch {

    static int binarysearching(int numbers[],int key){
        int start=0; 
        int last=numbers.length-1;
        
        while (start<=last) {
            int mid=start+(last-start)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;

        System.out.println(binarysearching(numbers, key));
    }
}
