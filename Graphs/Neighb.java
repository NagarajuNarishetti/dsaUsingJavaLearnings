import java.util.*;
public class Neighb{
    static class Edge{
        int src;
        int dest;
        int wei;

        public Edge(int src,int dest,int wei){
            this.src=src;
            this.dest=dest;
            this.wei=wei;
        }

    }

    public static void main(String [] args){
        int v=5;
        ArrayList<Edge> [] graph=new ArrayList[v];

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,5));

        for(int i=0;i<graph[0].size();i++){
            // e=graph[i];
            Edge e=graph[0].get(i);
            System.out.println(e.dest);
        
        }
    }
}