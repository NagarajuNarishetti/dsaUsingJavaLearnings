class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}

public class SSL{
    private Node head;
    public SSL(){
        head=null;
    }

    public void insertAtBegin(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    
    public void printSSL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }

    }
    public 
    public static void main(String[] args){
        SSL list=new SSL();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.printSSL();
    }
}