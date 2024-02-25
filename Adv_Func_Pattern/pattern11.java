package Adv_Func_Pattern;



public class pattern11 {
    public static void hollowDiamond(int num) {
        // first half
        for (int i = 1; i <= num; i++) {
            //spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            //star and spaces 
            for (int j = 1; j <= 2 * i - 2; j++) {
                if (i == 1 || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //star
            for (int j = 1; j <= num; j++) {
                if (j == 1) {
                    System.out.print("*");
                } 
            }
            System.out.println();
        }
        // second half
        for (int i = num; i >= 1; i--) {
            //star
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }//spaces and star
            for (int j = 1; j <= 2 * i - 2; j++) {
                if (i == 1 || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }//star
            for (int j = 1; j <= num; j++) {
                if (j == 1) {
                    System.out.print("*");
                } 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowDiamond(8);
    }
}
