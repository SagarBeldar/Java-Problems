package LinearSeacrh;

public class basuc4 {

    public static int maxValue(int matrix[][]){
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]>maxValue){
                maxValue=matrix[i][j];
               }
               
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int number[][]={
            {20,1,30,40},
            {15,25,35,45},
            {27,29,376,48},
            {23,33,43,56}
        };

        System.out.println(maxValue(number));
    }
}
