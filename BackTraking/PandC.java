public class PandC{
    public static void main(String [] args){
        pandC("","abc");
    }
    static void pandC(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for(int i=0;i<up.length();i++){
        char ch=up.charAt(i);
        pandC(p+ch, up.substring(0, i)+up.substring(i+1));
        }
    }
}
