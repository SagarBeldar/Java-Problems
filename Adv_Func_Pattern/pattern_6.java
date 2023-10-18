package Adv_Func_Pattern;

public class pattern_6 {
    public static void binarytriangle_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        binarytriangle_pattern(7);
    }
}
