import java.util.ArrayList;
public class Arrlst {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(10);
        ArrayList<Integer> lst=new ArrayList<>(5);
        for(int i=0;i<8;i++)
        {
            lst.add(10);
        }
        list.add(19);
        list.add(30);
        list.add(3);
        list.add(9);
        System.out.println(list);
    }
}