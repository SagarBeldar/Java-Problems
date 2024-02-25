package Array;

public class basic6 {
    public static void main(String[] args) {
        int array[]={2,4,5,6,78,54,12};
         System.out.println(max_Array(array));
      // Rangemax(array, 01, 04);
    }

    public static void Rangemax(int array[],int start,int end){
       int maxValue=Integer.MIN_VALUE;
       for(int i=start;i<=end;i++){
        if(array[i]>maxValue){
                maxValue=array[i];
            }
            
       }System.out.println(maxValue); 
       
    }

    public static int max_Array(int array[]) {
        int maxValue=Integer.MIN_VALUE;
         for(int i=0;i<array.length;i++){
            if(array[i]>maxValue){
                maxValue=array[i];
            }
          
         }
         return maxValue;
    }
}
