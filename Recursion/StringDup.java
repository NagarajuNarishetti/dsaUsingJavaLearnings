public class StringDup {
    public static void main(String []args){
        System.out.println("abcdeabcefgad");
        dup("","abcdeabcefgad");
    }
    static void dup(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        if(p.contains(String.valueOf(ch))){
            dup(p,up.substring(1));
        }
        else{
            dup(p+ch,up.substring(1));
        }
    }
}
