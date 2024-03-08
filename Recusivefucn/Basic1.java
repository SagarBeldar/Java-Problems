package Recusivefucn;
public class Basic1 {
    public static void main(String[] args) {  
        print(1);
    }

    static int print(int n){
        if(n==7){
            System.out.println(n);
            return n;
        }
        System.out.println(n);
        return print(n+1);
    }
}
