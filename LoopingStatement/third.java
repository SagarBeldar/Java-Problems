

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int range=0;
    while(range<=number){
        System.out.println(range+" ");
        range++;
    }
    sc.close();
}
}
