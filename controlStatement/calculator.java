package controlStatement;

import java.util.Scanner;

public class calculator {
    public static  void main(String ags[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number...");
        int a=sc.nextInt();

        System.out.println("Enter second Number...");
        int b=sc.nextInt();

        System.out.println("Enter operator...");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println(a+b);
            break;

            case '-': System.out.println(a-b);
            break;

            case '*': System.out.println(a*b);
            break;

            case '/': System.out.println(a/b);
            break;

            default: System.out.println("Wronng Operator...");
            break;  
        }
         sc.close();
    }
}
