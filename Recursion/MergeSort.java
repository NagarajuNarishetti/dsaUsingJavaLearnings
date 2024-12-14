import java.util.*;
public class MergeSort {
    public static void main(String []args){
        int [] arr={ 12,1,45,11,0,9,3,6,2};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int [] arr,int s,int e){
        if(e-s<2){
            return ;
        }
        int mid=s+(e-s)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid,e);
        int [] left= Arrays.copyOfRange(arr,s,mid);
        int [] right=Arrays.copyOfRange(arr,mid,e);
        merge(arr, left, right,s);
    }
    public static void merge(int [] arr,int [] left,int [] right,int s){
         int i=0,j=0,k=s;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
}
