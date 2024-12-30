import java.util.*;
public class FirstCodeOnTrees{
     FirstCodeOnTrees(){
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    private static Node root;
    static void populate(){
        System.out.println("Enter The rootNodeValue");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        root=new Node(r);
        insertValues(sc,root);
    }
    static void insertValues(Scanner sc,Node node){
        System.out.println("Do you want to install to the left of :  "+node.data);
        Boolean left=sc.nextBoolean();
        if(left){
            System.out.print("Enter the value : ");
            int x=sc.nextInt();
            node.left=new Node(x);
            insertValues(sc, node.left);
        }
        System.out.println("Do you want to install to the Right of :  "+node.data);
        Boolean right=sc.nextBoolean();
        if(right){
            System.out.print("Enter the value : ");
            int x=sc.nextInt();
            node.right=new Node(x);
            insertValues(sc, node.right);
        }
    }
    static void display(){
        helper(root,"");
    }
    static void helper(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(node.data+indent);
        helper(node.left, indent+"\t");
        helper(node.right, indent+"\t");
    }
    public static void main(String[] args) {
        populate();
        display();
    }
}