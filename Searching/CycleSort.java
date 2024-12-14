import java.util.*;
public class CycleSort {
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void cs(int [] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                swap(arr,i,arr[i]-1);
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args){
        int [] arr={1,3,5,2,4,6,9,8,7,10};
        cs(arr);
        System.out.println(Arrays.toString(arr));
    }
}
