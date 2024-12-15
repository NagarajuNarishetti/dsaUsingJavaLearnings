import java.util.*;
public class Maze {
    public static void main(String [] args){
        // System.out.println(mazeCount(3,3));
        // mazePath(new StringBuilder(),3,3);
    //    System.out.println(mazePathList(new StringBuilder(),3,3));
    // System.out.println(mazePathDiagonalList(new StringBuilder(),3,3));
    boolean obs[][]={
        {true,true,true},
        {true,true,true},
        {true,true,true}
    };
    // System.out.println(mazePathDiagonalListObstacles(new StringBuilder(),obs,3,3));
    // mazeAllPaths("",obs,0,0);
    // System.out.println(mazeAllPathsList("",obs,0,0));
    int [][] path= new int[obs.length][obs[0].length];
     mazeAllPathSteps("",obs,path,1,0,0);
    }

    static int mazeCount(int r,int c){
        if(r==1||c==1){
            // System.out.printf("(%d,%d)\n",r,c);
            return 1;
        }
        int R=mazeCount(r,c-1);
        int D=mazeCount(r-1,c);
        return R+D;
    }
    static void mazePath(StringBuilder p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1){
            mazePath(p.append('D'),r-1,c);
            p.deleteCharAt(p.length() - 1);
        }
        if(c>1){
            mazePath(p.append('R'),r,c-1);
            p.deleteCharAt(p.length() - 1);
        }
    }
    static ArrayList<StringBuilder> mazePathList(StringBuilder p,int r,int c){
        if(r==1 && c==1){
            ArrayList<StringBuilder> list =new ArrayList<>();
            list.add(new StringBuilder(p));
            return list ;
        }
        ArrayList<StringBuilder> ans=new ArrayList<>();
        if(r>1){
          ans.addAll(mazePathList(p.append('D'),r-1,c));
            p.deleteCharAt(p.length() - 1);
        }
        if(c>1){
           ans.addAll(mazePathList(p.append('R'),r,c-1));
            p.deleteCharAt(p.length() - 1);
        }
        return ans;
    }
    static ArrayList<StringBuilder> mazePathDiagonalList(StringBuilder p,int r,int c){
        if(r==1 && c==1){
            ArrayList<StringBuilder> list =new ArrayList<>();
            list.add(new StringBuilder(p));
            return list ;
        }
        ArrayList<StringBuilder> ans=new ArrayList<>();
        if(r>1 &&c>1){
            ans.addAll(mazePathDiagonalList(p.append('D'), r-1, c-1));
            p.deleteCharAt(p.length() - 1);
        }
        if(r>1){
          ans.addAll(mazePathDiagonalList(p.append('V'),r-1,c));
            p.deleteCharAt(p.length() - 1);
        }
        if(c>1){
           ans.addAll(mazePathDiagonalList(p.append('H'),r,c-1));
            p.deleteCharAt(p.length() - 1);
        }
        return ans;
    }

    static ArrayList<StringBuilder> mazePathDiagonalListObstacles (StringBuilder p,boolean obs[][],int r,int c){
        if(r==obs.length-1 && c==(obs[0].length-1)){
            ArrayList<StringBuilder> list =new ArrayList<>();
            list.add(new StringBuilder(p));
            return list ;
        }
        ArrayList<StringBuilder> ans=new ArrayList<>();
        if(obs[r][c]==false){
            return ans;
        }
        if(r<obs.length-1 &&c<(obs[0].length-1)){
            ans.addAll(mazePathDiagonalListObstacles(new StringBuilder(p).append('D'),obs, r+1, c+1));
            // p.deleteCharAt(p.length() - 1);
        }
        if(r<obs.length-1){
          ans.addAll(mazePathDiagonalListObstacles(new StringBuilder(p).append('V'),obs,r+1,c));
            // p.deleteCharAt(p.length() - 1);
        }
        if(c<obs[0].length-1){
           ans.addAll(mazePathDiagonalListObstacles(new StringBuilder(p).append('H'),obs,r,c+1));
            // p.deleteCharAt(p.length() - 1);
        }
        return ans;
    }
    static void mazeAllPaths(String p,boolean obs[][],int r,int c){
        if(r==obs.length-1 && c==(obs[0].length-1)){
            System.out.println(p);
            return  ;
        }
        if(!obs[r][c]){
            return ;
        }
        obs[r][c]=false;
        if(r<obs.length-1){
          mazeAllPaths(p+'D',obs,r+1,c);
        }
        if(c<obs[0].length-1){
           mazeAllPaths(p+'R',obs,r,c+1);
        }
        if(r>0){
            mazeAllPaths(p+'U',obs,r-1,c);
        }
        if(c>0){
           mazeAllPaths(p+'L',obs,r,c-1);
         }
      obs[r][c]=true;
    } 
    static ArrayList<String> mazeAllPathsList(String p,boolean obs[][],int r,int c){
        if(r==obs.length-1 && c==(obs[0].length-1)){
            // System.out.println(p);
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList<String> ans =new ArrayList<>(); 
        if(!obs[r][c]){
            return ans ;
        }
        obs[r][c]=false;
        if(r<obs.length-1){
          ans.addAll(mazeAllPathsList(p+'D',obs,r+1,c));
        }
        if(c<obs[0].length-1){
            ans.addAll(mazeAllPathsList(p+'R',obs,r,c+1));
        }
        if(r>0){
            ans.addAll(mazeAllPathsList(p+'U',obs,r-1,c));
        }
        if(c>0){
            ans.addAll(mazeAllPathsList(p+'L',obs,r,c-1));
         }
      obs[r][c]=true;
      return ans;
    }

    static void mazeAllPathSteps (String p,boolean obs[][],int path[][],int step,int r,int c){
        if(r==obs.length-1 && c==(obs[0].length-1)){
            path[r][c]=step;
            for(int[] arr:path){
            System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return  ;
        }
        if(!obs[r][c]){
            return ;
        }
        obs[r][c]=false;
        path[r][c]=step;
        if(r<obs.length-1){
          mazeAllPathSteps (p+'D',obs,path,step+1,r+1,c);
        }
        if(c<obs[0].length-1){
           mazeAllPathSteps (p+'R',obs,path,step+1,r,c+1);
        }
        if(r>0){
            mazeAllPathSteps (p+'U',obs,path,step+1,r-1,c);
        }
        if(c>0){
           mazeAllPathSteps (p+'L',obs,path,step+1,r,c-1);
         }
      obs[r][c]=true;
      path[r][c]=0;
    }
}
