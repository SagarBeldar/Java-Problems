 package Recursion;
public class Basic7 {
   
    static void duplicateStrRemove(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a'] ==true){
            //duplicate string
            duplicateStrRemove(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            duplicateStrRemove(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str="sagarbeldar";
        duplicateStrRemove(str, 0,new StringBuilder(""), new boolean[26]);
    }
}
