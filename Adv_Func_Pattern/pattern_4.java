package Adv_Func_Pattern;

public class pattern_4 {
    public static void fluodtriangle(int n){
        int number=1;
        for(int i=1;i<=n ;i++){
             for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
             }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        fluodtriangle(5);
    }
}
