package Basics;
import java.util.Scanner;
public class Function{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Two Numbers :\n ");
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int s=sum(n1,n2);
    System.out.print("Sum is "+s);
    }
   static int sum(int a,int b){
    return a+b;
   }
}