package LinearSeacrh;

public class evendigit {

    public static void EvenDigit(int number[]){
        for(int i=0;i<number.length;i++){
            if(number[i]%2==0){
                System.out.println(number[i]);
            }
        }
    }
    public static void main(String[] args) {
        int number[]={1,24,4,56,78,567,133,5};
        EvenDigit(number);
    }
}
