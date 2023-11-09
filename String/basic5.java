package String;
public class basic5 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder(""); //stringBuilder means modify the word

        for(char i='a';i<='z';i++){
            sb.append(i+" ");
        }

        System.out.println(sb);
    }
}
