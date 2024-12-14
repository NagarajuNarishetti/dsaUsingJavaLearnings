public class  RevNumber{
    public static void main(String[] args){
        int sum=REV(1234567);
        System.out.println(sum);
    }
    public static int REV(int n){
        if(n%10==n){
            return n;
        }
        if(n==0){
            return 0;
        }
        else{
            return (n%10)*10 +REV(n/10);
        }
    }
}