package Adv2_Func_Pattern;

public class basic1 {
    public static void numberPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                 System.out.print(" ");
            }
           
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
              System.out.println();
        }
      
    }
    public static void main(String[] args) {
        numberPyramid(8);
    }
}
