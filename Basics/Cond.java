package Basics;
import java.util.Scanner;
public class Cond {
    public static void main(String[] args){
   Scanner input=new Scanner(System.in);
    char ch= input.next().trim().charAt(0);
    if(ch>='a'&& ch<='z')
    System.out.print("It is lowercase");
    else
    System.out.print("It is Upper Casse");
    }
}