package LinkedList_1;

public class LL {
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }  
    }
     static Node head;
     static Node tail;


    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if (head == null) {
            System.out.println("LL is empty ");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL NewLL=new LL();
        NewLL.print();
        NewLL.addFirst(2);
        NewLL.print();
        NewLL.addFirst(1);
        NewLL.print();
        NewLL.addLast(3);
        NewLL.print();
    }
}
