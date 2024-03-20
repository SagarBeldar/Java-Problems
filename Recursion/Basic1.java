package Recursion;
public class Basic1 {

    static void printDec(int n){
        if(n==1){          //base class imp in recursion for not overflow
            System.out.println(n);
            return;
        }
    System.out.print(n+" ");
    printDec(n-1);
    }
    
    static void printInc(int n){ 
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
public static void main(String[] args) {
    printDec(10);
    printInc(5);
}
}

//