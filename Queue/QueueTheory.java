/*
 * Queue in Java: Theory and Explanation
 * -------------------------------------
 * A queue is a linear data structure that follows the FIFO (First In, First Out) principle.
 * Elements are added to the back (rear) of the queue and removed from the front.
 * Queues are widely used in scenarios like task scheduling, handling requests, and more.
 *
 * Main Operations:
 * 1. Enqueue: Adds an element to the rear of the queue.
 * 2. Dequeue: Removes and returns the element at the front of the queue.
 * 3. Peek/Front: Returns the front element without removing it.
 * 4. isEmpty: Checks if the queue is empty.
 * 5. isFull (in fixed-size implementations): Checks if the queue is full.
 *
 * Java provides multiple ways to implement queues:
 * 1. Using `Queue` interface and classes like `LinkedList`, `PriorityQueue`, and `ArrayDeque`.
 * 2. Custom implementation using arrays or linked lists.
 */

 import java.util.*;

 public class QueueTheory {
     public static void main(String[] args) {
         System.out.println("Queue Implementation in Java");
 
         // Using LinkedList as a Queue
         Queue<Integer> linkedListQueue = new LinkedList<>();
         System.out.println("\nUsing LinkedList as a Queue:");
         linkedListQueue.add(10); // Enqueue
         linkedListQueue.add(20);
         linkedListQueue.add(30);
         System.out.println("Queue: " + linkedListQueue);
         System.out.println("Front element: " + linkedListQueue.peek()); // Peek
         System.out.println("Removed: " + linkedListQueue.poll()); // Dequeue
         System.out.println("Queue after removal: " + linkedListQueue);
 
         // Using ArrayDeque
         Queue<Integer> arrayDeque = new ArrayDeque<>();
         System.out.println("\nUsing ArrayDeque as a Queue:");
         arrayDeque.add(100);
         arrayDeque.add(200);
         arrayDeque.add(300);
         System.out.println("Queue: " + arrayDeque);
         System.out.println("Front element: " + arrayDeque.peek());
         System.out.println("Removed: " + arrayDeque.poll());
         System.out.println("Queue after removal: " + arrayDeque);
 
         // PriorityQueue Example
         Queue<Integer> priorityQueue = new PriorityQueue<>();
         System.out.println("\nUsing PriorityQueue:");
         priorityQueue.add(50);
         priorityQueue.add(10);
         priorityQueue.add(40);
         System.out.println("PriorityQueue: " + priorityQueue);
         System.out.println("Front element: " + priorityQueue.peek());
         System.out.println("Removed: " + priorityQueue.poll()); // Removes smallest element
         System.out.println("PriorityQueue after removal: " + priorityQueue);
 
         // Custom Queue Implementation
         System.out.println("\nCustom Queue Implementation:");
         CustomQueue customQueue = new CustomQueue(5);
         customQueue.enqueue(1);
         customQueue.enqueue(2);
         customQueue.enqueue(3);
         customQueue.display();
         System.out.println("Dequeued: " + customQueue.dequeue());
         customQueue.display();
     }
 }
 
 class CustomQueue {
     private int[] elements;
     private int front;
     private int rear;
     private int size;
     private int capacity;
 
     public CustomQueue(int capacity) {
         this.capacity = capacity;
         elements = new int[capacity];
         front = 0;
         rear = -1;
         size = 0;
     }
 
     public void enqueue(int value) {
         if (size == capacity) {
             System.out.println("Queue is full!");
             return;
         }
         rear = (rear + 1) % capacity;
         elements[rear] = value;
         size++;
     }
 
     public int dequeue() {
         if (size == 0) {
             System.out.println("Queue is empty!");
             return -1;
         }
         int removedValue = elements[front];
         front = (front + 1) % capacity;
         size--;
         return removedValue;
     }
 
     public void display() {
         if (size == 0) {
             System.out.println("Queue is empty!");
             return;
         }
         System.out.print("Queue: ");
         for (int i = 0; i < size; i++) {
             System.out.print(elements[(front + i) % capacity] + " ");
         }
         System.out.println();
     }
 }
 