package Arraylist;
import java.util.*;

public class Basic5 {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList <Integer> list1=new ArrayList<>();
        ArrayList <Integer> list2=new ArrayList<>();
        ArrayList <Integer> list3=new ArrayList<>();
        for(int i=0;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainlist.add(list1); mainlist.add(list2);mainlist.add(list3);
        // list2.remove(2);
        // list2.remove(4);
        System.out.println(mainlist);
        
        //nested loop
        for(int i=0;i<mainlist.size();i++){
            ArrayList <Integer> currlist=mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }


        // ArrayList <Integer> list1=new ArrayList<>();
        // list1.add(1);list1.add(2);
        // System.out.println(list1);

        // ArrayList <Integer> list2=new ArrayList<>();
        // list2.add(3); list2.add(4);
        // System.out.println(list2);

        // mainlist.add(list1);
        // mainlist.add(list2);
        // System.out.println(mainlist);
    }
}
