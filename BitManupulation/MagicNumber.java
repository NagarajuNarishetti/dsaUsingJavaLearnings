import java.util.*;
public class MagicNumber {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=0,i=1;

    while(n>0){
        System.out.print((n&1) +" ");
        ans+=(n&1)*Math.pow(5,i++);
        n=n>>1;

    }
    System.out.println();
    System.out.println(ans);
 }
}