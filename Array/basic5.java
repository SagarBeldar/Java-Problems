package Array;

// import java.util.Arrays;

public class basic5 {

     public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        swap(array,1,2);
        System.out.println();

    }

    public static void swap(int array[],int num1,int num2){
      
        int temp=array[num1];
        array[num1]=array[num2];
        array[num2]=temp;
    }
   

}
