package practice;
/**
 * fibonacci
 */
public class fibonacci {
                            //Fibonacci Series
    static void fibonacciSeries(int n){
        int num1=0;
        int num2=1;
        System.out.println("Fibonaccu Series is upto "+n+" numbers ");
        System.out.print(num1+" ");

        for(int i=1;i<=n;i++){
            int nextNum=num1+num2;
            num1=num2;
            num2=nextNum;

            System.out.print(num1+" ");
        }

    }
                                   //Factorial No.
    static void factNo(int n){
        if(n==0 || n==1){
            System.out.println("1");
        }

        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;

        }
        System.out.println("factorial no of "+n+" is:"+result);
        
    }                                    
    public static void main(String[] args) {
        // fibonacciSeries(8);
        factNo(5);
    }
}