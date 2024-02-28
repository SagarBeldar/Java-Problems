package Recursion;

public class Basic2 {
                                           //Factorial NO.
    static int fact(int n){
        //base case
        if(n==1){ //0 or 1
            return 1;
        }
      //step 1 call fn
    //   int fnm1=fact(n-1);
      int fn=n*fact(n-1);
      return fn;
    }

                                 //print sumof first n natural no

    static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int Sumn=n+calcSum(n-1);
        return Sumn;
    }                   
    
                                //print xto the n 2^10
        static int power(int x,int n){
            if(n==0){
                return 1;
            }
            return x * power(x, n-1);
        }
                                //potimized soln for power
    
        static int optizedPower(int x,int n){
            if(n==0){
                return 1;
            }
            int halfPowersqr=optizedPower(x, n/2) * optizedPower(x, n/2);
            // for an odd
            if(n%2!=0){
                halfPowersqr=x*halfPowersqr;
            }
            return halfPowersqr;
        }
    public static void main(String[] args) {
        // System.out.println(fact(5));
        // System.out.println(calcSum(10));
    //    System.out.println( power(2, 10));
        System.out.println(optizedPower(2, 10));

    }
}
