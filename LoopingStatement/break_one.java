// package LoopingStatement;

import java.util.*;
public class break_one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        do{
          System.out.println("Enter a Number");
             int number=sc.nextInt();
             if(number%10==0){
                break;
             }
        }while(true);
     sc.close();
    }
}
