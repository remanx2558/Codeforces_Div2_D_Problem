import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringGame {
    static int all;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        int arr[]=new int[a.length()];

        for(int i=0;i<a.length();i++){arr[i]=s.nextInt();}

        all=-1;
        function(a,b,arr,0,a.length()-1);
        System.out.println(all+1);
    }
    static void function(String a,String b,int []arr,int s,int e){
        if(s>e || s<0 || e>=arr.length){
            return ;
        }
        int mid=(s+e)/2;
        int ans=-1;

        if(find(a,b,arr,mid)>=1){
            all=Math.max(all,mid);
           function(a,b,arr,mid+1,e);


        }
        else{
            function(a,b,arr,s,mid-1);
        }

    }

    static int find(String s1,String s2,int a[],int mid)
    {

        ///matching subsequnece not sub string
        //do not use sorting ...simple 1 traversal will work
        int mark[]=new int[s1.length()];
        for(int i=0;i<=mid;i++)
        {
            mark[a[i]-1]=1;
        }
        int k=0;
        for(int i=0;i<s1.length();i++)
        {
            if(mark[i]!=1)
            {
                if(s1.charAt(i)==s2.charAt(k))
                {
                    k++;
                    if(k==s2.length())
                    {
                        return 1;

                    }
                }
            }
        }
        return 0;
    }
}
