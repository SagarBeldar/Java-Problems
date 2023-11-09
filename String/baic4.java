 package String;
public class baic4 {
    //lexicographyc = Smallest letter in words start e.g (a smallest start word)apple,mango ,banana.

    //compareto(InbuiltKeyword) = A != a
    //comparetoIgnoreCase (InbuiltKeyword) =  A==a 

    public static void main(String[] args) {
        String [] fruits={"apple","mango","banana"};

        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);

    }

}
