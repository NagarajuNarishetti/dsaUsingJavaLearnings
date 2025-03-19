import java.util.*;
class  MajorityElement{
    public static void  main(String [] args){
        int [] arr={1,2,3,4,3,2,3,3,2,31,3,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Integer> list= new HashSet<>();
        for (int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        list=map.keySet();
        
        System.out.println(list);
        System.out.println(map);

        for (Integer ele:list){
            if((map.get(ele)>arr.length/3)){
                System.out.print(ele+"\t");
            }
        }
    }
}