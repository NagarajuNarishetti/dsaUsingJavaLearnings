import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class SL{
    private static Node head;
    public static void main(String[] args){
        SL sll = new SL();
        Scanner sc= new Scanner(System.in);
        // int n;
        // n=sc.nextInt();
        sll.addAtBegin(12);
        
         
        display();
        
    }
    public static void display(){
        Node temp= head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data+"->");
    }
    public static void addAtBegin(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }
}