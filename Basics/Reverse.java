package Basics;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
    Scanner n= new Scanner(System.in);
    int n1,temp,rev=0;
    n1=n.nextInt();
    while(n1>0){
    temp=n1%10;
    rev=temp+rev*10;
    n1/=10;
    }
    System.out.print(rev);
    }
}
