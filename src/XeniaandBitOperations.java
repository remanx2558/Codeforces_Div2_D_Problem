import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class XeniaandBitOperations {
//    public static void main(String argrs[]){
//        Scanner s=new Scanner(System.in);
//
//        int n=s.nextInt();
//        int m=s.nextInt();
//        int siz=(int)Math.pow(2,n);
//        //////////////////////////
//        hsiz=(2*siz)-1;
//        hep=new int[hsiz];
//
//        int k=hsiz-1;
//        for(int i=0;k>0 && i<siz;k--,i++){
//            hep[k]=s.nextInt();
//        }
//        ////1st time fullfillment/////
//        greed(k,n,m,siz);
//        ////querries////
//        for(int i=0;i<m;i++){
//            int p=s.nextInt()-1;
//            p=hsiz-p-1;
//            int b=s.nextInt();
//            function(p,b,false);
//            System.out.println(hep[0]);
//        }
//    }
//    static int hep[];
//    static int hsiz;
//    static void greed(int k,int n,int m,int siz){
//
//        /////////////////////
//        boolean xor=false;
//        int tc=siz/2;
//        int count=0;
//
//        for(;k>=0;k--){
//            int c1=2*k+1;
//            int c2=c1+1;
//
//            if(xor==false && c2>=0 && c1>=0 && c1<hsiz && c2<hsiz){
//                hep[k]=hep[c1]|hep[c2];
//            }
//            else if( c2>=0 && c1>=0 && c1<hsiz && c2<hsiz){
//                hep[k]=hep[c1]^hep[c2];
//            }
//            count++;
//            if(count==tc){
//                count=0;
//                tc=tc/2;
//                xor=!xor;
//
//            }
//        }
//    }
//    static void function(int p,int b,boolean xor){
//
//        if(p<0 || p>=hsiz){
//            return;
//        }
//        if(b==hep[p]){
//            return;
//        }
//
//        hep[p]=b;
//        if(p==0){
//            //System.out.println(hep[p]);
//            return;
//        }
//
//
//        int parent=(p-1)/2;
//        int c1=2*parent+1;
//        int c2=c1+1;
//        if(c1>=0 && c2>=0 && c1<hsiz && c2<hsiz && parent>=0 && parent<hsiz){
//
//            int val=0;
//            if(xor==false){
//                val=hep[c1]|hep[c2];
//            }
//            else{
//                val=hep[c1]^hep[c2];
//
//            }
//            function(parent,val,!xor);
//        }
//        return;
//    }
static Scanner in=new Scanner();
    static int segment[],a[];
    static ArrayList<ArrayList<Integer>> al=new ArrayList<>();
    public static void main(String[] args) throws Exception{
        //int t=in.readInt();
        //while(t-->0) {

        int n=in.readInt();
        int q=in.readInt();
        int siz= (int) Math.pow(2,n);
        a=nextIntArray(siz);//siz==(1<<n)
        segment=new int[(siz*4)+1 ];///n is even : odd levels else even
        buildSegmentTree(0,0,(1<<n)-1,1-n%2);
        while(q-->0) {
            int p=in.readInt();
            int val=in.readInt();
            ///level:1-n%2???????
            update(0,0,(1<<n)-1,p-1,val,1-n%2);
            System.out.println(segment[0]);
        }
        //}
    }
    static void update(int ind,int low,int high,int i,int val,int lev) {
        ///binary search type updation
        if(low==high) {
            segment[ind]=val;
            a[i]=val;
            return;
        }
        ///going to root cause
        int mid=(low+high)>>1;
        if(mid<i) {
            update(2*ind+2,mid+1,high,i,val,lev+1);
        }
        else {
            update(2*ind+1,low,mid,i,val,lev+1);
        }

        ////actual updation
        if(lev%2==0)
            segment[ind]=segment[2*ind+1]|segment[2*ind+2];
        else
            segment[ind]=segment[2*ind+1]^segment[2*ind+2];
    }
    static void buildSegmentTree(int ind,int low,int high,int lev) {
       //top-down DP building
        if(low==high) {
            segment[ind]=a[low];
            return;
        }
        int mid=(low+high)>>1;
        ///parent:ind
        //left_chile:2*ind+1
        //right_child:2*ind+2
        buildSegmentTree(2*ind+1,low,mid,lev+1);
        buildSegmentTree(2*ind+2,mid+1,high,lev+1);
        if(lev%2==0)
            segment[ind]=segment[2*ind+1]|segment[2*ind+2];
        else
            segment[ind]=segment[2*ind+1]^segment[2*ind+2];
    }

    static int[] nextIntArray(int n){
        int[] arr= new int[n];
        int i=0;
        while(i<n){
            arr[i++]=in.readInt();
        }
        return arr;
    }
    static class Scanner{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String readString() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        double readDouble() {
            return Double.parseDouble(readString());
        }
        int readInt() {
            return Integer.parseInt(readString());
        }
        long readLong() {
            return Long.parseLong(readString());
        }
    }
}
