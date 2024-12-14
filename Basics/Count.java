package Basics;
import java.util.Scanner;
public class Count {
    public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int n1=n.nextInt(),temp,count=0;
    // System.out.print();
    while(n1>0){
        temp=n1%10;
        if(temp==7)
            count++;
        n1/=10;
    }
    System.out.print(count);
    }
    
}
