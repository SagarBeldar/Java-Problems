package Array;
// import java.util.*;
public class basic2 {
    public static int getlargest(int num[]){
       int largest=Integer.MIN_VALUE;//     -Infinity

       for(int i=0;i<num.length;i++){
        if(largest<num[i]){
            largest=num [i];
        }
       }
       return largest;
    }

    public static int getsmallest(int num[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(smallest>num[i]){
             smallest=num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7};
        System.out.println("Largest Value is "+getlargest(numbers));
        System.out.println("Smallest Value is"+getsmallest(numbers));
    }
    
}
