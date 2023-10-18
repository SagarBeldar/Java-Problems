package controlStatement;

public class first {
    public static void main(String[] args) {
        int age = 17;
        if (age > 18) {
            System.out.println("Adult: vote,Drink");

        } 
        else if(age >13 && age <18){
            System.out.println("Teenager");
        }
        else {
            System.out.print("Not Adult");
        }

    }

}
