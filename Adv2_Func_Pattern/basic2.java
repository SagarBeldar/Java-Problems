package Adv2_Func_Pattern;

public class basic2 {
    public static void palindromicNo_Pattern(int n){
     
        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=(n-i);j++){
                System.err.print("  ");
            }
            //Dec_No.
          for(int j=i;j>=1;j--){
            System.out.print(j+" ");
          }
          for(int j=2;j<=i;j++){
            System.out.print(j+" ");
          }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindromicNo_Pattern(6);
    }
}
