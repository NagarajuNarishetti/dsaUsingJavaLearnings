import java.util.Scanner;
// import java.util.Arrays;
public class Arrstr {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter how many elements in the arrray : ");
        int  n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        // for(String num:arr){
        //     System.out.println(num);
        // }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
        // System.out.println(arr);
    }
}
