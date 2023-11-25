package OOPS;



public class basic4 {
    public static void main(String[] args) {
        Calculator calc =new Calculator();
        System.out.println(calc.sum(1,3 ));
        System.out.println(calc.sum((float)1.3, (float)2.3)); //required float compiler consider decimal as double
        System.out.println(calc.sum(1,2 , 3));
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
