//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            ArrayList<Integer> ele=new ArrayList<>();
            for(int j=0;j<adj.get(i).size();j++){
                if(adj.get(i).get(j)==1){
                    ele.add(j);
                }
            }
            graph.add(ele);
        }
        int count=0;
        int vtces=graph.size();
        boolean[] visited=new boolean[vtces];
        for(int i=0;i<vtces;i++){
            if(visited[i]==false){
                getComponent(i,graph,visited);
                count++;
            }
        }
        return count;
    }
    static void getComponent(int src,ArrayList<ArrayList<Integer>> graph,boolean[]  visited){
        visited[src]=true;
        for(int i=0;i<graph.get(src).size();i++){
            int nbr=graph.get(src).get(i);
            if(visited[nbr]==false){
                getComponent(nbr,graph,visited);
            }
        }
    }
};