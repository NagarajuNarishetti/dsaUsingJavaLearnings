public class ArraySorted {
    public static void main(String[] args){
        int [] arr={3,4,6,7,19,20};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        return helper(arr,1);
    }
    public static boolean helper(int [] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        
        return arr[i]<=arr[i+1] && helper(arr, i+1) ;
        
    }
}
