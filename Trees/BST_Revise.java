public class BST_Revise{
    class Node{
        int data,height;
        Node left,right;
        Node(int data){
            this.data=data;
            this.height=1;
        }
    } 
    private Node root;
    public  void insert(int data){
        root=insert(data,root);
    }
    public Node insert(int data,Node node){
        if(node==null){
            return new Node(data);
        }
        if(data<node.data){
            node.left=insert(data, node.left);
        }
        else{
            node.right=insert(data, node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;

    }
    public int height(Node node){
        if(node==null){
            return 0;
        }
        return node.height;
    }
    public void display(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node==null){
            return; 
        }
        inOrder(node.left);
        System.out.println(node.data+" "+node.height);
        inOrder(node.right);
    }
    public boolean binarySearch(int key){
        if(binarySearch(root,key)){
            return true;
        }
        return false;
    }
    public boolean binarySearch(Node node ,int key){
        if(node==null){
            return false;
        }
        else if(node.data==key){
            return true;
        }
        if(node.data<key){
           return binarySearch(node.right,key);
        }
        else{
          return binarySearch(node.left, key);
        }
    }
    public static Node deletNode(Node node,int value){
        if(node.data>value){
            node.left=deletNode(node.left, value);
        }
        else if(node.data<value){
            node.right=deletNode(node.right, value);
        }
        else{
            if(node.left==null && node.right==null){
                return null;
            }
            if(node.left==null){
                return node.right;
            }
            else{
                return node.left;
            }
            Node is=findInorderSucessor(node.right,value);
            node.data=is.data;
            node.right=deletNode(root.right, is.data);
        }

        

    }

    public static void main(String []args){
        BST_Revise bst= new BST_Revise();
        int [] values={ 2,6,4,1,9,7,0,3};
        for(int i=0;i<values.length;i++){
            bst.insert(values[i]);
        }
        bst.display();
        System.out.println(bst.binarySearch(9));

    }
}