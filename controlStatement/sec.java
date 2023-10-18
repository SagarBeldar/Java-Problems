package controlStatement;

import java.util.*;

public class sec {
    public static void main(String args[]) {

        System.out.println("Enter The Number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.print("Even Number");

        } else {
            System.out.println("Odd Number");
        }
        sc.close();

    }
}
