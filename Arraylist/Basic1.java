package Arraylist;
import java.util.ArrayList;
public class Basic1 {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);

        // list.add(2,17);
        // System.out.println(list);
        // System.out.println(list.size());

        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        
        //------------------Reverse Of Arraylist --------------------
        for(int i=list.size()-1;i>=1;i--){
            System.out.println(list.get(i));
        }
        
        //get element
        // System.out.println(list.get(3));
        // //remove element
        // list.remove(2);
        // System.out.println(list);
        // //set element
        // list.set(3,10);
        // System.out.println(list);
        // //contains element
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(8));

    }
}
