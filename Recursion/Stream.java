public class Stream {
    public static void main(String[] args){
        StringBuilder up= new StringBuilder("bbcadancahfga");
        StringBuilder p=new StringBuilder();
        System.out.println(up);
        stream(p,up);
    }
    
    static void stream(StringBuilder p,StringBuilder up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        up.deleteCharAt(0);
        if(ch=='a'){
            stream(p, up);
            // stream(p, up.substring(1));
        }
        else{
            stream(p.append(ch), up);
            // stream(p.append(ch), up.substring(1));
        
        }
    }
}
