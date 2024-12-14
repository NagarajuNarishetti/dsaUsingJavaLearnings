import java.util.Scanner;

public class ZeroOne{
       public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                    if((j+i)%2==0){
                        System.out.print(1+" ");
                    }
                    else{
                        System.out.print(0+" ");
                    }
            }
            System.out.println();
        }

    }    
}
