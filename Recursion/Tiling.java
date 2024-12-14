public class Tiling {
    public static void main(String [] args){
        System.out.println(Dice(5));
    }
    static int Dice(int n){// 2*n
   if(n==0 ||n==1){
    return 1;
   }
   int v= Dice(n-1);
   int h= Dice(n-2);
    return v+h;
    }
}
