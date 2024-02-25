package OOPS;

public class basic3 {
    public static void main(String[] args) {
        Fish obj=new Fish();
        obj.eat();
        Tuna fish=new Tuna();
        fish.name="A giant watre fish";

        System.out.println(fish.name);
        fish.breath();
    }
}

//BAse class -Parent class
class Animal{
   String name;

   void eat(){
     System.out.println("Eating");

   }
   void breath(){
    System.out.println("breathing");
   }
}

//Derived Class-Child class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swimming");
    }
}

//Again derived class 
class Tuna extends Fish{
    int legs;
}