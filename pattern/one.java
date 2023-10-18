package pattern;

import java.util.Scanner;
class one{
public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("ENter The Number");
    int n=sc.nextInt();

    for(int line=1;line<=n; line++){
        for(int j=1; j<=line;j++){
            System.out.print("*");
        }
        System.out.println();
    }
      sc.close();
}
}
