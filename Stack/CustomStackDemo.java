// Theory about Stacks in Java

/**
 * A stack is a linear data structure that follows the Last In First Out (LIFO) principle.
 * This means that the last element added to the stack is the first one to be removed.
 */

// Key Operations of a Stack:
/**
 * 1. Push: Adds an element to the top of the stack.
 * 2. Pop: Removes and returns the top element of the stack.
 * 3. Peek/Top: Returns the top element of the stack without removing it.
 * 4. IsEmpty: Checks whether the stack is empty.
 * 5. Size: Returns the number of elements in the stack.
 */

// Implementing Stack in Java
/**
 * Stacks can be implemented using:
 * 1. Java's built-in Stack class (part of java.util package).
 * 2. Custom implementation using arrays.
 * 3. Custom implementation using linked lists.
 */

// Example 1: Using the built-in Stack class
import java.util.Stack;

public class CustomStackDemo {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Push operation
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushes: " + stack);

        // Peek operation
        System.out.println("Top element: " + stack.peek());

        // Pop operation
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Size of stack
        System.out.println("Size of stack: " + stack.size());
    }
}

// Example 2: Custom Stack Implementation using Arrays
/**
 * Array-based stack implementation involves using a fixed-size array to hold stack elements.
 * A `top` variable tracks the current index of the stack's top element.
 */
class ArrayStack {
    private int[] stack; // Array to store stack elements
    private int top;     // Index of the top element
    private int capacity; // Maximum capacity of the stack

    // Constructor to initialize the stack with a specific size
    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Indicates an empty stack
    }

    // Push operation: Adds an element to the top of the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    // Pop operation: Removes and returns the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Error value for an empty stack
        }
        return stack[top--];
    }

    // Peek operation: Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Error value for an empty stack
        }
        return stack[top];
    }

    // IsEmpty operation: Checks if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Size operation: Returns the number of elements in the stack
    public int size() {
        return top + 1;
    }
}

// Example 3: Custom Stack Implementation using Linked Lists
/**
 * A linked list-based stack dynamically allocates memory for its elements.
 * Each element is represented by a `Node` containing data and a reference to the next node.
 */
class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack {
    private Node top; // Reference to the top node

    // Constructor initializes the stack as empty
    public LinkedListStack() {
        top = null;
    }

    // Push operation: Adds an element to the top of the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation: Removes and returns the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Error value for an empty stack
        }
        int value = top.data;
        top = top.next; // Move top to the next node
        return value;
    }

    // Peek operation: Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Error value for an empty stack
        }
        return top.data;
    }

    // IsEmpty operation: Checks if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

// Usage of Custom Stack Implementations
class StackDemo {
    public static void main(String[] args) {
        // Demonstrate ArrayStack
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(10);
        arrayStack.push(20);
        System.out.println("Top element (ArrayStack): " + arrayStack.peek());

        // Demonstrate LinkedListStack
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(30);
        linkedListStack.push(40);
        System.out.println("Top element (LinkedListStack): " + linkedListStack.peek());
    }
}

// Advantages of Stack:
/**
 * 1. Simplicity of operations (push, pop).
 * 2. Useful for solving problems like balancing symbols, reversing strings, and evaluating expressions.
 */

// Disadvantages of Stack:
/**
 * 1. Fixed size in case of array implementation.
 * 2. Limited by memory constraints in case of linked list implementation.
 */
