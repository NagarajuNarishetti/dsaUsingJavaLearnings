import java.util.*;
public class MulArrLst {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lst=new ArrayList<> ();
        for(int i=0;i<4;i++)
        {
            lst.add(new ArrayList<>());
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                lst.get(i).add(sc.nextInt());
            }
        }
        System.out.println(lst);
    }
}