package Basics;
import java.util.Scanner;
public class Swithch {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter Day Number : ");
    int w=in.nextInt();
    System.out.println("Enter word");
    String word= in.next();
    // switch(w){
    //     case 1:
    //     System.out.println("Monday");
    //     System.out.println("Day 1");
    //     break;
    //     case 2:
    //     System.out.println("Tuesday");
    //     break;
    //     default:
    //     System.out.println("Enter valid input");
    // }   
    switch(w){
        case 1 :
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        switch (word) {
            case "hello":
                System.out.println("Hello");
                break;
            case "hi":
               System.out.println("Hiii");
               break;
            default:
            System.out.println("Enter a valid input");           
         }
        break;
        default:
        System.out.println("Enter valid input");
    }
    }
}