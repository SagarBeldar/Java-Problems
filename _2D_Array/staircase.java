package _2D_Array;

import java.util.Arrays;

public class staircase {

  public static void main(String[] args) {
    int number[][] = {
        { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 27, 29, 37, 48 },
        { 23, 33, 43, 56 }
    };

    int key = 56;
    stairCase(number, key);
    System.out.println(Arrays.toString(rowcolumn(number,key)));
  }

  public static boolean stairCase(int number[][], int key) {

    int row = 0;
    int col = number[0].length - 1;
    while (row < number.length && col >= 0) {
      if (number[row][col] == key) {
        System.out.println(" found key at (" + row + "," + col + ")");
        return true;
      } else if (key < number[row][col]) {
        col--;
      } else {
        row++;
      }
    }
    System.out.println("Key not found");
    return false;
  }

  static int[] rowcolumn(int matrix[][], int target) {
    int r = 0;
    int c = matrix.length-1;

    while ((r < matrix.length && c >= 0)) {
      if (matrix[r][c] == target) {
        return new int[] { r, c };
      }

      else if(matrix[r][c]<target){
        r++;
      }
      else{
        c--;
      }
    }
    return new int[]{-1,-1};
  }
}
