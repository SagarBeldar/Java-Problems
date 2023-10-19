package LinearSeacrh;;
public class basic2 {

    public static boolean search(String name,char target){
        for(int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String name="sagar";
        char target='g';
        System.out.println(search(name, target));
    }
}
