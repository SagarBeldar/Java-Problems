package Fuction_Method;

public class bintodec{
    public static  void binto_dec( int binNum){

        int myNum=binNum;
        int power=0;
        int decNum=0;

        while(binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit* (int) Math.pow(2,power));  //math.pow(base,power)

            power++;
            binNum=binNum/10;
        }
        System.out.println("decimal of "+myNum+"= "+decNum);
    }

    public static void main(String[] args) {
        binto_dec(101);
    }
}