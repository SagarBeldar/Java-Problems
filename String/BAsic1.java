package String;

import java.util.Scanner;

public class BAsic1 {
    
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
       //String str2='abs'; not accepatble string(Invalid Charcter)

       String str3=new String("asdf");

       System.out.println(arr);
       System.out.println(str);
       System.out.println(str3);

       Scanner sc= new Scanner(System.in);

       String name=sc.nextLine();
       System.out.println(name);
       System.out.println(name.length());
       sc.close();
    }
}
