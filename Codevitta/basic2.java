package Codevitta;

import java.util.Scanner;

public class basic2 {
    public static void printDivisors(int n) {
        // ------------------------------method 1----------------------------
        /*
         * for(int i=1;i*i<=n;i++){
         * if((n%i)==0){
         * System.out.print(i+" ");
         * System.out.println(n/i);
         * }
         * }
         */
        // ------------------------------method 2----------------------------
        int i = 0;
        for (i = 1; i * i <= n; i++) {
            if ((n % i) == 0) {
                System.out.println(i + " ");
            }
        }

        for (; i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                System.out.println(n / i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDivisors(n);
        sc.close();

    }

}
