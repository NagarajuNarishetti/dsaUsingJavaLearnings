import java.util.*;
public class Anagram {
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch: t.toCharArray()){
            if(map.containsKey(ch)){
            if(map.get(ch)==1){
                map.remove(ch);
            }
            else if(map.get(ch)>1){
                map.put(ch,map.get(ch)-1);
            }
            else{
                return false;
            }
        }else{
            return false;
        }
        }
        return map.isEmpty();
    }
    public static void main(String [] args){
        String s="aabc";
        String t="abca";
        System.out.println(isAnagram(s,t));
    }
}
