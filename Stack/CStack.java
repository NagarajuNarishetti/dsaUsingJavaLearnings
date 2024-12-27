import java.util.*;

public class CStack {
    private int[] stack; // Array to store stack elements
    private int size; // Current size of the stack
    private int capacity; // Maximum capacity of the stack

    // Constructor to initialize the stack with a default size
    public CStack() {
        this(10); // Default size is 10
    }

    // Constructor to initialize the stack with a specific size
    public CStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.size = 0;
    }

    // Push operation: Adds an element to the top of the stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        stack[size++] = data;
    }

    // Peek operation: Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[size - 1];
    }

    // Pop operation: Removes and returns the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[--size];
    }

    // IsEmpty operation: Checks if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // IsFull operation: Checks if the stack is full
    public boolean isFull() {
        return size == capacity;
    }

    // Size operation: Returns the current size of the stack
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize the stack with a custom size or default size
        CStack stack = new CStack(5);

        // Push elements into the stack
        System.out.println("Enter 5 elements to push into the stack:");
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            stack.push(n);
        }

        System.out.println("Current stack:");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.stack[i] + " ");
        }
        System.out.println();

        // Pop elements from the stack
        System.out.println("Popped elements:");
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }

        // Push additional elements to demonstrate reuse
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after pushing more elements:");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.stack[i] + " ");
        }
        System.out.println();
    }
}



/*port java.util.*;
public class CStack{
    private static final int Defaultsize=10;
    private static int ptr=-1;
    // CStack(int size){
    // private Static int [] arr=new int[Defaultsize];

    static void push(int arr[],int data){
        if(isFull(arr)){
            System.out.print("Stack is Full");
            return ;
        }
        arr[++ptr]=data;
    }
    static int peek(int[] arr){
        return arr[ptr];
    }


    static int  pop(int arr[]){
        if(isEmpty(arr)){
            System.out.print("Stack is empty");
            return -1;
        }
     return arr[ptr--];
    }


    static boolean isEmpty(int arr[]){
         return ptr==-1;
    }
    static boolean isFull(int arr[]){
        return arr.length==ptr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        // pop(arr);
        // push(arr,10);
        int n;
        for(int i=0;i<5;i++){
            n=sc.nextInt();
            push(arr,n);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(pop(arr));
        System.out.println(pop(arr));
        System.out.println(pop(arr));
        System.out.println(pop(arr));
        System.out.println(pop(arr));
        push(arr,10);
        push(arr,2);
        push(arr,30);
        push(arr,40);
        System.out.println(Arrays.toString(arr));
    }

}
    */