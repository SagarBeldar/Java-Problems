package Recursion;
/**
 * towerofHanoi
 */
public class towerofHanoi {
    static void towerHanoi(int n,String src,String Helper,String Dest){
        if(n==1){
            System.out.println("Disk transfer "+n+" from "+src+" to "+Dest);
            return;
        }
        towerHanoi(n-1, src, Dest, Helper);
        System.out.println("Disk transfer "+n+" from "+src+" to "+Dest);
        towerHanoi(n-1, Helper, src, Dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerHanoi(n,"s", "H", "D");

    }
}