package String;

public class str_occurance {
    public static void main(String[] args) {
        String str="a2b3c1";

        stroccurance(str);
    }

    public static void stroccurance(String str){
        
        for(int i=0;i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
            else{
                int x=Character.getNumericValue(str.charAt(i));
                for(int j=1;j<x;j++){
                    System.out.print(str.charAt(i-1));
                }
            }
        }
    }
}
