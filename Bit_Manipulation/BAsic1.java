package Bit_Manipulation;
public class BAsic1 {

    public static boolean isPoweroftwo(int n){
      return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPoweroftwo(32));
    }
    
}
