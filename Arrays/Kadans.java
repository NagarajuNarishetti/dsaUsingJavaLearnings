public class Kadans{
    public static void main(String[] args){
        int []arr={3,2,-1,2,-9,7,1};
        int cs=0,ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            if(cs>ms){
                ms=cs;
                
            }
            System.out.print(" "+ms);
        }
        System.out.println("\nMAX SUM IS "+ms);
    }
}