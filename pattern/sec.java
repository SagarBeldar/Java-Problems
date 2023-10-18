package pattern;

import java.util.Scanner;

public class sec {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter Patter Star Number");
        int n=sc.nextInt();
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
