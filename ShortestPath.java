package graphalgo;


import java.util.Vector;

class ShortestPathAlgos{
    int min(int a,int b){
        if(a<b){
            return a;
        }
        return b;
    }
    public void sourceToAllVertexShortestPath(int source,int matrix[][],int V){
        int distance[]=new int[V];
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            distance[i]=999999;
            visited[i]=false;
        }
            distance[source]=0;
            visited[source]=true;
          int i=0;
          int count=0;
        while (count<V){
            for(int j=1;j<V;j++){
                if(matrix[i][j]>0) {
                    distance[j] = min(distance[i] + matrix[i][j], distance[j]);
                    System.out.println(distance[j]+" ");
                }
            }
            int m=0;
            int min=999999;
            for(int k=0;k<V;k++){
                if(visited[k]==false){
                    if(min>distance[k]){
                        min=distance[k];
                        m=k;
                    }

                }
            }
            i=m;
            visited[i]=true;
            count+=1;
            System.out.println();
        }
       // for(int p=0;p<V;p++) {
         //   System.out.println(distance[p]+" ");
        //}
    }
}
public class ShortestPath {
    public static void main(String[] args) {

        ShortestPathAlgos obj=new ShortestPathAlgos();

       // int matrix[][]=new int[8][8];
        int matrix[][]={
                {0,2,4,6,0,0,0,0,0},
                {0,0,1,3,3,2,7,0,0},
                {0,0,0,1,0,0,2,0,0},
                {0,0,0,0,2,0,0,5,7},
                {2,0,0,0,0,0,0,4,0},
                {0,0,0,0,0,0,2,0,0},
                {0,0,1,4,0,0,0,1,2},
                {0,0,0,0,0,0,0,0,2},
                {0,0,0,0,0,3,4,0,0}};
        //Vector<Vector<Integer>>matrix=new Vector<>();

        obj.sourceToAllVertexShortestPath(0,matrix,9);
    }
}
