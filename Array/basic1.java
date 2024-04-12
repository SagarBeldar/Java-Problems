 package Array ;
//  import java.util.*;

public class basic1 {
    public static void update(int marks[],int no){
        no=8;
        for(int i=0;i<marks.length;i++){
            marks[i]= marks[i]+1;
            // System.out.print(marks[i]+" ");
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int value=5;
        update(marks,value);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");  
        }
        System.out.println(value);
    }
    
}
