public class BinaryString {
    public static void main(String [] args){
        binaryString(3,0,"");
    }
    static void binaryString(int n,int ld,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(ld==0){
            binaryString(n-1,0, str+'0');
            binaryString(n-1, 1, str+'1');
        }
        else if(ld==1){
            binaryString(n-1, 0, str+'0');
        }
    }
}
