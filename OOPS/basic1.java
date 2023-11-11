package OOPS; 

public class basic1 {
    public static void main(String[] args) {
        Pen p1=new Pen(); //created a pen object called p1
        // p1.setColor("blue");
        p1.colour="blue";
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen{
    //Properties +fuction
    String colour;
    int tip;

    void setColor(String color){
        colour=color;
    }

    void setTip(int size){
        tip=size;
    }

class student{
    String name;
    int age;
    float percenrage;

    void calculatePercent(int math,int chem,int phy){
        percenrage=(math+chem+phy)/3;
    }
}
}
