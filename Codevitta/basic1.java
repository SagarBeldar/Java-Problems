package Codevitta;
import java.util.Scanner;

public class basic1 {
    //-----------------------Print Divisors Of given No.(Method First)----------------------
  /*  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if((n%i)==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }*/


     //-----------------------Print Divisors Of given No.(Method Second)----------------------
    public static void printDivisors(int n){
        for(int i=1;i*i<=n;i++){
            if((n%i)==0){
                System.out.print(i+" ");
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDivisors(n);

        sc.close();
    }
}
