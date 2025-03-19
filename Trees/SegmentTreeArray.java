import java.util.*;
class SegmentTreeArray{
    static int [] stree;
    public static void  init(int n){
        stree= new int [4*n];
    }
    public static int buildStree(int []arr,int i,int start,int end){
        if(start==end){
            stree[i]=arr[start];
            return arr[start];
        }
        int mid=(start+(end-start)/2);
        buildStree(arr, 2*i+1, start, mid);
        buildStree(arr, 2*i+2, mid+1, end);
        stree[i]=stree[2*i+1]+stree[2*i+2];
        return stree[i];
    }
    public static void updateutil(int i,int si,int sj,int idx,int diff){
        if(si>idx || sj<idx){
            return ;
        }

        stree[i]+=diff;
        if(si!=sj){
        int mid=si+((sj-si)/2);
        updateutil(2*i+1, si, mid, idx, diff);
        updateutil(2*i+2, mid+1, sj, idx, diff);
        }
    }
    public static void update(int []arr,int idx,int value){
        int n=arr.length;
        int diff=value-arr[idx];
        arr[idx]=value;
        updateutil(0,0,n-1, idx,diff);
    }
    public static void main(String args[]){
        int [] arr={1,2,3,4,5,6,7,8};
        int  n=arr.length;
        init(n);
        buildStree(arr, 0, 0, n-1);
        // for (int i=0;i<n;i++){
        //     System.out.print(stree[i]+"\t");
        // }
        System.out.println(Arrays.toString(stree));

        update(arr, 2, 2);
        System.out.println(Arrays.toString(stree));
    }
}