package Recursion;


public class Basic5 {
   static int first=-1;
   static int last =-1;
    static void findOccurance(String str,int idx,char el){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==el){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOccurance(str, idx+1, el);
    }

    public static void main(String[] args) {
        String str="abaacdaefaah";
        findOccurance(str, 0, 'a');
    }
}
