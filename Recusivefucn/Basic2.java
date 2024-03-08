package Recusivefucn;

public class Basic2 {
    public static void main(String[] args) {
        System.out.println(fiboSerires(10));
    }

    static int fiboSerires(int n){
        if(n==0 || n==1){
            return n;
        }
     int fib= fiboSerires(n-1)+fiboSerires(n-2);
     return fib;

    }
}
