package Recursion;

public class Basic4 {
    static int sortarr(int n){
        int n1=sortarr(n-1);
        int n2=sortarr(n);
        if(n1<n2){
            n2=n1;
        }
        return n2;
    }

    public static void main(String[] args) {
        int arr[]={4,6,1,2,5,3};
        System.out.println(arr);
    }
}
