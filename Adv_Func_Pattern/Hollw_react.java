package Adv_Func_Pattern;

public class Hollw_react {

    public static void Hollw_Pattern(int row, int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    //Boundery Line
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
        Hollw_Pattern(4, 5);
    }
}
