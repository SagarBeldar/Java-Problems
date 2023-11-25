
//----------------------What will the output of code?(both classes in same package)

package OOPS;
public class Que1 {
    
    public static void main(String[] args) {
        Vehicle obj1=new Car();
        obj1.print();

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
    void print(){
        System.out.println("Print Second");
    }
}
