class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class InsertAtBegin{
private Node head=null;
public void InsAtBegin(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
    }
    else{
        newNode.next=head;
        head=newNode;
    }
    
}
public void Print(){
    Node temp=head;
    if(head==null){
        System.out.println("Linked list is empty");
    }
    else{
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
}
    public static void main(String[] args){
       InsertAtBegin list=new InsertAtBegin();
       list.Print();
       list.InsAtBegin(4);
       list.InsAtBegin(3);
       list.InsAtBegin(4);
       list.InsAtBegin(3);
       list.InsAtBegin(4);
       list.InsAtBegin(3);
       list.InsAtBegin(4);
       list.InsAtBegin(3);
       
        list.Print();
    }

}