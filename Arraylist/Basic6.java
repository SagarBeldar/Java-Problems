package Arraylist;

import java.util.*;

public class Basic6 {

    static boolean pairSum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while (lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }

            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        int target=80;
        System.out.println(pairSum(list1, target));

        // for(int i=0;i<list1.size();i++){
        //     for(int j=i+1;j<list1.size();j++){
        //         if(list1.get(i)+list1.get(j)==5){
        //             System.out.println("sum of 5 is pair of ( "+i+","+j+" )");
        //         }
        //     }
        // }

        

    }
}
