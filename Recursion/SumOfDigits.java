public class SumOfDigits{
    public static void main(String[] args){
        int sum=SOD(01234567);
        System.out.println(sum);
    }
    public static int SOD(int n){
        if(n==0){
            return 0;
        }
        else
            return n%10 +SOD(n/10);
    }
}