package Backtracking;

public class Basic2 {

    public static void main(String[] args) {
        String str="abc";
        findSubsets(str,"",0);
    }

    static void findSubsets(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
                
            }else{
                System.out.println(ans);
            }
            
            return;
        }
        
        //Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        
        //No choice
        findSubsets(str, ans, i+1);
    }
    
}