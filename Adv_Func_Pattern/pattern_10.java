package Adv_Func_Pattern;

public class pattern_10 {
    public static void dianmond(int n){
        //first Half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }  
              System.out.println();
        }
      
        //Second Half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            } 
            System.out.println(); 
        }
        
    }

    public static void main(String[] args) {
        dianmond(5);
    }
}
