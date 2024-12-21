import java.util.*;
class Node{
    int data;
    Node next=null;
    Node(){
        next=null;
    }
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class SLL{
    private static Node head;
    public static void main(String[] args){
        // SLL sll = new SLL();
        Scanner sc= new Scanner(System.in);
        int n,x;
        n=sc.nextInt();
        while(n-->0){
        x=sc.nextInt();
        // SLL.addAtBegin(x);
        SLL.addAtEnd(x);
        // sll.addAtBegin(x);
        // sll.addAtBegin(14);
        }
        display();
        System.out.print("\n Enter N: ");
        n=sc.nextInt();
        // SLL.deleteByValue(n);
        SLL.deleteByIndex(n);
        // SLL.insetAt(n,200);

        display();  
    }

    static void addAtBegin(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    } 

    static void addAtEnd(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else {
            Node temp= head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    static void deleteByIndex(int index){
        Node temp=head;
        int i=0;
        if(temp==null){
            System.out.println("Index out of bound");
        }
        while(temp.next!=null && i<index){
            temp=temp.next;
            i++;
        }
        // if(temp.next!=null){
        if(i==index)
            temp.next=temp.next.next;
        //   }
        // else{
            // System.out.println("Somting is wrong\n");
        // }
    }

    static void deleteByValue(int data){
        Node temp=head;
        while(temp.next!=null && temp.next.data!=data){
            temp=temp.next;
        }
        if(temp.next.data==data){
            temp.next=temp.next.next;
        }
        else{
            System.out.println("No Such Element is Found ");
        }
    }

    static void insetAt(int index,int data){
        Node temp=head;
        int i=0;
        while (temp.next!=null && i++<index-1) {
            temp=temp.next;
        }
        if(temp.next==null){
            temp.next= new Node(data);
        }
        else{
            Node temp2=new Node() ;
            temp2.next=temp.next;
        }
    }
    static void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        // System.out.print(temp.data);
    }
}