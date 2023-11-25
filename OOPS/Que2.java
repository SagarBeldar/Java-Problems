
//----------------------What will the output of code?(both classes in same package) 
//Ans =>Code give Error

package OOPS;
public class Que2 {
    
    public static void main(String[] args) {
        Vehicle obj1=new Car();
        //obj1.print1();

        Vehicle obj2=new Vehicle();
        obj2.print();

    }
}

class Vehicle{
    void print(){
        System.out.println("Print first");
    }
}

class Car extends Vehicle{
    void print1(){
        System.out.println("Print Second");
    }
}
 
