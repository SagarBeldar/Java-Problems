package Arraylist;
import java.util.*;
public class Basic2 {
    public static void main(String[] args) {
         //------------------Max Of Arraylist --------------------
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(3);
        list.add(15);
        list.add(8);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max=list.get(i);
            // }

            max=Math.max(max,list.get(i));
        }

        System.out.println("maximum no. is "+max);
    }
}