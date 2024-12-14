public class Stream2 {
    public static void main(String[] args){
        String up= new String("bbcadancahfga");
        System.out.println(up);
        System.out.println(stream(up));
        
    }
    static String stream(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch= up.charAt(0);

        if(ch=='a'){
            return stream(up.substring(1));
        }
        else{
            return ch+stream(up.substring(1));
        
        }
    }
}
