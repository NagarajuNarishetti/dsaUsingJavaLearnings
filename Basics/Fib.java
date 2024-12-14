package Basics;
import java.util.Scanner;
public class Fib {
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int a=0,b=1,i=0;
        int n1= n.nextInt();
        // System.out.print("0 ");
      while(i<=n1){
        //     int temp=a;
        //     b=b+a;
        //     System.out.print(b+" ");
        //     // b=a;
        //     a=temp;
        // // System.out.print(temp+" ");
        // // temp+=i;
        System.out.print(a+" ");
        int temp=b;
        b=a+b;
        a=temp;
        i++;
        // System.out.print(a+" ");       
        }
        
        // System.out.print(n1*((n1+1)/2));
    }
}
