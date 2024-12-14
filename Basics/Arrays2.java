import java.util.Scanner;
import java.util.Arrays;
public class Arrays2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter how many elements in the arrray : ");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // for(int num:arr){
        //     System.out.println(num);
        // }
        System.out.println(Arrays.toString(arr));
    }
}
