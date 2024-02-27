package Recursion;
public class Basic3 {
    static int fibonacciSeries(int n){
        if(n==0 || n==1){
            return n;
        }

        int fibm1=fibonacciSeries(n-1);
        int fibm2=fibonacciSeries(n-2);
        int fibn=fibm1+fibm2;
        // System.out.print(fibn);
        return fibn;
        
    }

    public static void main(String[] args) {
        System.out.println(fibonacciSeries(10));
    }
}
