package Practice_que_DSA;

public class min_max {
    public static void main(String[] args) {
     int numbers[]={12,39,84,5,7,3,10,12};
//===================================max value======================================
     int max=Integer.MIN_VALUE ;
     for(int i=0;i<numbers.length;i++){
        if(numbers[i]>max){
            max=numbers[i];
           
        }
     }   
     System.out.println("min Element "+ max);
//===================================min value======================================
      int min=Integer.MAX_VALUE ;
       for(int i=0;i<numbers.length;i++){
        if(numbers[i]<min){
            min=numbers[i];
        }
       }

         System.out.println("min Element "+ min);
    }
     
}
