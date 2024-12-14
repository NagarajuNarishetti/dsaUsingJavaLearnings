package Basics;
// import java.util.Scanner;
public class Arm {
    public static void main(String[] args){
//   Scanner sc=new Scanner(System.in);
//   int n=sc.nextInt();
//   System.out.print(isprime(n));
        arm();
    }
    static void arm(){
     int c=100,arm=0,n=1000;
     while(n>100){
    //   c=100;
    while(c<=0){
        int temp=c%10;
        arm=arm+temp*temp*temp;
        c=c/10;
    } c++;
    System.out.println(arm);
    }
n--;
}
    
}
