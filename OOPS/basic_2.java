package OOPS;

public class basic_2{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="sagar";
        s1.Roll=123;
        s1.marks[0]=80;
        s1.marks[1]=90;
        s1.marks[2]=100;
        Student s2 =new Student(s1);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    int Roll;
    String name;
    int marks[];

    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.Roll=s1.Roll;
        this.marks=s1.marks;
    }
    Student(){
    marks=new int[3];
    }
    Student(String name){
    marks=new int[3];
    this.name=name;
    }
    Student(int Roll){
    marks=new int[3];
    this.Roll=Roll;
    }
}
