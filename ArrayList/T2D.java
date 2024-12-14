import java.util.*;
public class T2D {
    public static void main(String [] args){
        List<List<Integer>> AB =new ArrayList<>();
        int p=1;
        for(int  i=1;i<=5;i++){
            List<Integer> B=new ArrayList<>();
            for(int j=0;j<3;j++){
                B.add(i*p++);
            }
            AB.add(B);
        }
        System.out.println(AB);
    }
   
}
