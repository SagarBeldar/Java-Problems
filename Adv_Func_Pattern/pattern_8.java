package Adv_Func_Pattern;

public class pattern_8 {
     void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_8 obj=new pattern_8();
        obj.solid_rhombus(5);
    }
}
