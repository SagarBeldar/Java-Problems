package Arraylist;
import java.util.*;
public class rainwater {
    //------------------BruteForce Method --------------------------
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater=0;
    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int ht=Math.min(height.get(i), height.get(j));
    //             int width=j-i;
    //             int currWater=ht*width;
    //              maxWater=Math.max(maxWater, currWater);
    //         }
    //     }

    //     return maxWater;
    // }

    //-------------------Optimized Code---------------------------- two ptr approach

    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        int Lp=0;               //Left pointer
        int Rp=height.size()-1; //right pointer
        //looping codn
        while(Lp<Rp){
            // Calculate water area
            int ht=Math.min(height.get(Lp),height.get(Rp));
            int width=Rp-Lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater, currWater);

            //updation ptr
            if(height.get(Lp)<height.get(Rp)){
                Lp++;
            }else{
                Rp--;
            }
            
        }
        return maxWater;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
