package Adv_Func_Pattern;

public class pattern_7 {
     public static void butterfly_pattern(int n){
        //First Half
        for(int i=1;i<=n;i++){

            //star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
             System.out.println();
        }

        //Second Half
        for(int i=n;i>=1;i--){

            //star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
             System.out.println();
        }
       
     }
     public static void main(String[] args) {
        butterfly_pattern(6);
     }
}
