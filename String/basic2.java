package String;

public class basic2 {

    public static boolean palindromeString(String str){ 
        
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string="nion";
        System.out.println(palindromeString(string));
    }
    
}
