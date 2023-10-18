package Fuction_Method;
public class basic3 {

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("value of a :"+ a);
        System.out.println("Vale of b :" +b);

    }
    public static void main(String[] args) {
        int a=10;
        int b=5;

        swap(a,b);

        
    }
}
