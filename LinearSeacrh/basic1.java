package LinearSeacrh;
public class basic1 {

    public static int linear_search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                 return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={12,13,15,56,67,89};
        int key=67;

        System.out.println(linear_search(numbers, key));
    }
    
}
