import java.util.*;
public class CustomQueue{
    private static int [] Queue;
    private static int end=0;
    private static int capacity;

     CustomQueue(){
        this(10);
    }

    CustomQueue(int capacity){
        this.capacity=capacity;
        this.Queue= new int[capacity];
        this.end=0;
        
    }
    static void add(int data){
        if(isFull()){
            System.out.println("Queue is Full ");
            return;
        }
        Queue[end++]=data;
    }
    static int pop(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
        int ele=Queue[0];
        for(int i=1;i<end;i++){
            Queue[i-1]=Queue[i];
        }
        end--;
        return ele;
        }
    }
    static boolean isFull(){
        return end==capacity;
    }
    static boolean isEmpty(){
        return end==0;
    }
    static  void disp(){
        for(int i=0;i<end;i++){
            System.out.print(Queue[i]+" ");
        }
    }
    public static void main(String []args){
        CustomQueue cq=new CustomQueue();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int x=sc.nextInt();
            cq.add(x);
        }
        cq.disp();
        System.out.println();
        // System.out.println(Arrays.toString(Queue));
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        // System.out.println(Arrays.toString(Queue));
        cq.disp();
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        cq.disp();
        System.out.println(cq.pop());
    }
}