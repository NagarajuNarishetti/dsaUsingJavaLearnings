import java.util.*;

public class BST {
    static class Node{
     int value,height;
     Node right,left;
    
    Node(int value){
        this.value=value;
        this.right=null;
        this.left=null;
        this.height = 0;
    }
    public int getValue(){
        return this.value;
    
      }
  }  
    
  public BST(){
    
   }
   
   private Node root;
   public void insert(int value){
    root=insert(value,root);
   }

   public Node insert(int value,Node node){
    if(node==null){
        return new Node(value);
    }
    if(value<node.value){
        node.left=insert(value, node.left);
    }
    else{
        node.right=insert(value, node.right);
    }
    node.height=Math.max(height(node.left),height(node.right))+1;

    return node;
    
   }
   public int height(Node node){
    if(node==null){
        return -1;
    }
    return node.height;
   }
   public boolean balanced(){
    return balanced(root);
   }
   public boolean balanced(Node node){
    if(node==null){
        return true;
    }
    return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
   }
   public void display(){
    display("Root Node is : ",root);
   }
   public void display(String details,Node node){
        if(node==null){
            return ;
        }
        System.out.println(details+node.value);
        display("Left Child of "+node.value+ " is : ",node.left);
        display("Right Child of "+node.value+ " is :",node.right);

   }
   public void populate(int [] arr){
    for(int i=0;i<arr.length;i++){
        insert(arr[i]);
    }
   }
   public void populateSorted(int []arr){
    populateSorted(arr,0,arr.length);
   }
   public void populateSorted(int []arr,int start,int end){
    if(start>=end){
        return;
    }
    int mid=start+(end-start)/2;
    insert(arr[mid]);
    populateSorted(arr,start,mid);
    populateSorted(arr,mid+1,end);
   }

   public void inOrder(){
    inOrder(root);
   }

   public void preOrder(){
    preOrder(root);
   }

   public void postOrder(){
    postOrder(root);
   }

   public void preOrder(Node node){
    if(node==null){
        return ;
    }
    System.out.println(node.value+" ");
    preOrder(node.left);
    preOrder(node.right);
   }

   public void inOrder(Node node){
    if(node==null){
        return ;
    }
    inOrder(node.left);
    System.out.println(node.value+" ");
    inOrder(node.right);
   }

   public void postOrder(Node node){
    if(node==null){
        return ;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.value+" ");
   }
   public void levelOrder(){
    Queue<Node>  q=new LinkedList<>();
    Node n=root;
    q.add(n);
    q.add(null);
    while(!q.isEmpty()){
        Node currNode=q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            System.out.print(currNode.value+" ");
            if(currNode.left!=null)
            q.add(currNode.left);
            if(currNode.right!=null)
            q.add(currNode.right);
        }
    }

   }
   
   public static void main(String[] args) {
    BST bst=new BST();
    // int [] arr={5,2,7,1,4,6,9,8,3,10};
    // bst.populate(arr);
    int [] arr={1,2,3,4,5,6,7,8,9,10};
    bst.populateSorted(arr);
    bst.display();
    System.out.println("PreOrder");
    bst.preOrder();
    System.out.println("InOrder");
    bst.inOrder();
    System.out.println("PostOrder");
    bst.postOrder();
    System.out.println("LevelOrder");  
    bst.levelOrder();
   }
   
}
