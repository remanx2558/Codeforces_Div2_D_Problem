import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Testsing {
    static int[]ans;
    //static HashMap<Integer,Integer>hm;
    public int[] maxGeneticDifference(int[] parents, int[][] queries) {
        ans=new int[queries.length];
        //node : parent
        // hm=new HashMap<Integer,Integer>();
        for(int i=0;i<queries.length;i++){
            tans=0;
            k=i;
            function(parents,queries[i][0],queries[i][1]);
        }

        return ans;
    }
    static int tans;
    static int k;
    public void function(int []par,int curr,int val){
        if(curr==-1){
            return;
        }
        int local=val^curr;
        tans=Math.max(tans,local);
        ans[k]=tans;

        int parent=par[curr];
        if(parent!=-1){
            function(par,parent,val);
        }
    }
}
