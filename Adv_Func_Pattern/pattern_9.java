package Adv_Func_Pattern;

public class pattern_9 {
    public static void hpllow_rhombis(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
               System.out.println();
        }
     
    }
    public static void main(String[] args) {
        hpllow_rhombis(7);
    }
}
