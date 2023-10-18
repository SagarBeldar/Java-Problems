package Fuction_Method;

import java.util.Scanner;

public class Dec_to_Bin {

    public static void dectobin(int n){
        int myNum=n;
        int power=0;
        int binNumber=0;

        while(n>0){
            int rem=n%2;
            binNumber=binNumber+(rem*(int)Math.pow(10,power));
          
            power++;
           

        }
        
            System.out.println("Binary No. of "+ myNum+" is ="+ binNumber );
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. Which want to conver into binary");
        int num=sc.nextInt();
       sc.close();
        dectobin(num);

    }
    
}
