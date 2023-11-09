package LinearSeacrh;
public class basic3 {
    public static boolean stairCase(int number[][],int key){

        int row=0; 
        int col=number[0].length-1;
        while(row<number.length && col>=0){
          if(number[row][col] ==key){
            System.out.println(" found ket at ("+row+","+col+")");
            return true;
          }
          else if(key<number[row][col]){
            col--;
          }

          else{
            row++;
          }
        }
        System.out.println("Key not found");
         return false;
    }
   

    public static void main(String[] args) {
        int number[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {23,33,43,56}
        };

        int key =30;
        stairCase(number, key);
    }
}
