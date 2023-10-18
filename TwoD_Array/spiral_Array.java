package TwoD_Array;

public class spiral_Array {

    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        System.out.println(startRow);
        System.out.println(startCol);
        System.out.println(endRow);
        System.out.println(endCol);

        if(startRow<=endRow && startCol<=endCol){

            //TOP
            for(int i=startCol;i<=endCol;i++){
                System.out.print(matrix[startCol][i]+" ");
            }
            //RIGHT
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            //BOTTOM
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(matrix[endCol][j]+" ");
            }
            //LEFT
            for(int j=endRow-1;j>startRow;j--){
                System.out.print(matrix[j][startRow]+" ");
            }
             //SEC.TOP
            for(int j=startRow+1;j<=endCol-1;j++){
                System.out.print(matrix[startRow+1][j]+" ");
            }
             //SEC. LAST RIGHT
            for(int j=endCol-1;j<=endRow-1;j++){
                System.out.print(matrix[endCol-1][j]+" ");
            }
            //SEC. LAST BOTTOM
            for(int j=endCol-2;j<endRow-1;j++){
                System.out.print(matrix[endCol-1][j]+" ");
            }
               
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printSpiral(matrix);
    }
}

//  //TOP
//             for(int i=startCol;i<=endCol;i++){
//                 System.out.print(matrix[startRow][i]+" ");
//             }
//             //RIGHT
//             for(int j=startRow+1;j<=endRow;j++){
//                 System.out.print(matrix[j][endCol]+" ");
//             }
//             //BOTTOM
//             for(int j=endCol-1;j>=startCol;j--){
//                if(startRow==endRow){
//                 break;
//                }
//                 System.out.print(matrix[endRow][j]+" ");
//             }
//             //LEFT
//             for(int j=endRow-1;j>=startRow+1;j--){
//                 if(startCol==endCol){
//                     break;
//                 }
//                 System.out.print(matrix[j][startCol]+" ");
//             }
//             // 
//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;