package OOPS;

public class basic5 {
   public static void main(String[] args) {
   } 
}

class Animal{
    Animal(){
        System.out.println("Animal constructor called..");
    }
}      

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor called");
    }
}
