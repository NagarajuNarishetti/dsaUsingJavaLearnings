class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class InsAtEnd{
    private Node head=null;

    public void InsertAtEnd(int data){
        Node newNode=new Node(data);
    if(head==null){
        head=newNode;
    }
    else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
}
public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("Null");
}
public  static void main(String[] args){
    InsAtEnd list=new InsAtEnd();
    list.InsertAtEnd(4);
    list.InsertAtEnd(4);
    list.InsertAtEnd(4);
    list.InsertAtEnd(4);
    list.InsertAtEnd(4);
    list.InsertAtEnd(4);
    list.InsertAtEnd(4);
    list.InsertAtEnd(4);
    list.print();
}

}