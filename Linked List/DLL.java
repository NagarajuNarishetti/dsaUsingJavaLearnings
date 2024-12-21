import java.util.*;
public class DLL {
    private class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        Node(int data,Node next,Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    void displayReverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.prev;
        }
        System.out.print("Null");
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            // newNode.prev=null;
            head=tail=newNode;
        }
        else{
        
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        }
        size++; 
    }
    void addLast(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    void addAt(int index,int data){
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds!");
            return;
        }
        Node newNode=new Node(data);
        if(index==0){
            addFirst(data);
        }
        else if(index==size){
            addLast(data);
        }
        else{
        Node temp=head;
        for (int i=0;temp!=null && i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next!=null){
            temp.next.prev=newNode;
        }
        temp.next=newNode;
     }
     size++;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        DLL dll =new DLL();
        int n=sc.nextInt();
        while(n-->0){
            int x=sc.nextInt();
            // dll.addFirst(x);
            dll.addLast(x);
        }
        dll.display();
        System.out.println();
        dll.displayReverse();
        int index,data;
        System.out.print("\nEnter the index : ");
        index=sc.nextInt();
        System.out.print("\nEnter the element : "); 
        data=sc.nextInt();
        dll.addAt(index,data);
        dll.display();
        System.out.println();
        dll.displayReverse();
    }
}
