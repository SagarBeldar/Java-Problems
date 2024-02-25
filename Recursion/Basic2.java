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
    public static void main(String[] args) {
        // System.out.println(fact(5));
        System.out.println(calcSum(10));
    }
}
