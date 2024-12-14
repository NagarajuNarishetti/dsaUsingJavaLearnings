import java.util.*;
public class Dice {
    public static void main(String [] args){
        // dice("",3);
        System.out.println(dicels("",7));
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }
    static List<String> dicels(String p,int target){
        if(target==0){
            List<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        List<String> ans=new ArrayList<String>();
        for(int i=1;i<=6 && i<=target;i++){
           ans.addAll(dicels(p+i,target-i));
        }
        return ans;
    }
}
