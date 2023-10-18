// package LoopingStatement;

public class reverse {
    public static void main(String[] args) {
        int number=65347;
        while(number>0){
            int lastDigit=number%10;
            System.err.print(lastDigit);
            number=number/10;
        }
    }
}
