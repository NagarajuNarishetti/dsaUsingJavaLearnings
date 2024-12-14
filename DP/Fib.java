import java.util.*;
public class Fib{   
    private static int fib(int n,int dp[]){
        if(n==0||n==1){
            return n;
        }
        else if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=fib(n-1,dp)+fib(n-2,dp);
        return dp[n];


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int n=sc.nextInt();
        int []dp=new int[n+1];
        for(int i=0;i<n;i++){
        System.out.print(fib(i,dp)+"\t"); 
        }
    }
}