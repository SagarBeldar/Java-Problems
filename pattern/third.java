package pattern;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();

        for (int i = 1; i<=n; i++) {
            for(int number=1;number<=i;number++){
                System.out.print(number);
            }
            System.out.println();
        }
        sc.close();
    }
}
