package Bit_Manipulation;
public class basic3 {
    public static void main(String[] args) {
        // System.out.println(ithposition(10, 2));
        // System.out.println(ithposition(15, 3));
        // System.out.println(ithposition(10, 6));

        // System.out.println(setithposition(10, 2));
        // System.out.println(setithposition(5, 3));

        // System.out.println(clearithposition(10,2));

        System.out.println(updateithposition(10,2,1));

    }
 //---------------------- print ith position ------------------------------------ print
    static int ithposition(int n,int i){
        int bitmask=1<<i;
      if((n & bitmask)==0){
        return 0;
      }
      return 1;
    }

//---------------------- set ith position ------------------------------------ set 1
static int setithposition(int n,int i){
    int bitmask=(1<<i);
    return n|bitmask;
}

 //---------------------- clear ith position ------------------------------------ clear ith (0)
 static int clearithposition(int n,int i){
    int bitmask=(1<<i);
    return n^bitmask;
 }

 //---------------------- Update ith's position ------------------------------------ 

 static int updateithposition(int n,int i,int newbit){
   if(newbit==0){
    return clearithposition(n,i);
   }
   else{
    return setithposition(n, i);
   }
 }
}
