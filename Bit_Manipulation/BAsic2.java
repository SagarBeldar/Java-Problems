package Bit_Manipulation;

import java.util.Scanner;


public class BAsic2 {
    public static void evenoddbit(int n){
        if((n & 1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        evenoddbit(n);


    }
}
