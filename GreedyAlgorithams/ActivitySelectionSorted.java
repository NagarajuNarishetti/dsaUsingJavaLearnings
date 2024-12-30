import java.util.*;
public class ActivitySelectionSorted{
    public static void main(String [] args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        List<Integer> activities=new ArrayList<>();
        activities.add(0);
        int curr_act=end[0];
        for(int i=1;i<start.length;i++){
            if(start[i]>curr_act){
                activities.add(i);
                curr_act=end[i];
            }
        }
        System.out.println(activities);
    }
}