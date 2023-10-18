package Fuction_Method;

import java.util.Scanner;

public class basic2 {

    public static int calculateSum(int num1,int num2){
       
        int c=num1+num2;
        return c;
       

        
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=calculateSum(a,b);
        System.out.println("Sum is : "+c);
        sc.close();
    }
}
