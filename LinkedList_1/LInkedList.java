package LinkedList_1;

import Array.reverse;

public class LInkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step1 =create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 newNode next=head
        newNode.next = head;

        // step 3 head=newNode
        head = newNode;
    }

    public void addLAst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println(" LL is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx== 0){
            addFirst(data);
            return;
        }

        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1     temp=prev
        newNode.next=temp.next;
        temp.next=newNode; 
     }

     public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        head=head.next;
        int val=head.data;
        size--;
        return val;
     }

     public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");

        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;

     }

    public static void main(String[] args) {
        LInkedList l1 = new LInkedList();
        l1.print();
        l1.addFirst(2);
        l1.print();
        l1.addFirst(1);
        l1.print();
        l1.addLAst(3);
        l1.print();
        l1.addLAst(4);
        l1.print();
        l1.add(2, 10);
        l1.print();
        l1.removeFirst();
        l1.print();;
        l1.removeLast();
        l1.print();


        // System.out.println(l1.size);
    }
}
