import java.util.*;
public class ActivitySelectionUnSorted {
    public static void main(String []args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int mat[][]=new int [start.length][3];
        for(int i=0;i<start.length;i++){
            mat[i][0]=i;
            mat[i][1]=start[i];
            mat[i][2]=end[i];
        }

        Arrays.sort(mat,Comparator.comparingDouble(o->o[2]));
        List<Integer> ans=new ArrayList<>();
        ans.add(0);
        int curr_task=end[0];
        for(int i=1;i<start.length;i++){
            if(mat[i][1]>=curr_task){
                ans.add(i);
                curr_task=mat[i][2];
            }
        }
        System.out.println(ans);

    }
}
