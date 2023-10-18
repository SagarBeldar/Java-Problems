package TwoD_Array;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        int array[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        //Input 
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = sc.nextInt();
            }
        }
        //Output

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                 
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }

        
    }
}
