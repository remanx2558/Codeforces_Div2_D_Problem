import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MagicPowderLevel1 {
    //differenc between my approach is that : it assumes answer as Binary search in total range
    //while mine assumed bs in array provided to me + then extra computations
    public static long MOD = 1000000007;
    static long result;

    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long[][]data = new long[n][2];
        for(int i = 0; i < 2; i ++){
            for(int j = 0 ; j < n; j++){
                data[j][i] = in.nextLong();
            }
        }



        long start = 0;
        long end = 2000000000;
        result = 0;
        function(start,end,k,data);
        System.out.println(result);

    }
    public static void function(long start,long end,long k,long[][]data){

        long n=data.length;
        if(start>end){
            return;
        }

            long mid = start + (end - start)/2;
            boolean ok = check(k,mid,data);

            if(ok){
                result = Math.max(result,mid);
                function(mid+1,end,k,data);

            }else{
                function(start,mid-1,k,data);
            }

    }
    static boolean check(long k,long mid,long[][]data){
        boolean valid =true;
        int n=data.length;
        long need = 0;


        for(int i = 0; i < n; i++){
            long v = mid*data[i][0];
            //System.out.println(mid);
            if(v > data[i][1]){
                //k+data[i][1]>=need+v
                if((k +data[i][1]) >= (v +need)){
                    need = need + (v - data[i][1]);
                }else{
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }
//    static long ext[];
//    static pair arr[];
//    static long k;
//
//    public static void main(String args[]){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        k=s.nextLong();
//        temp=0;
//
//
//        ext=new long[n];
//        arr=new pair[n];
//        for(int i=0;i<n;i++){
//            arr[i]=new pair();
//        }
//        for(int i=0;i<n;i++){
//            arr[i].o=s.nextLong();
//        }
//        for(int i=0;i<n;i++){
//            arr[i].p=s.nextLong();
//        }
//        Arrays.sort(arr,new my());
////        for(int i=0;i<n;i++){
////            double d1= (arr[i].p*1.0)/(arr[i].o*1.0);
////            System.out.print(d1+" ");
////
////        }
//        ans=0;
//        function(0,arr.length-1);
//        System.out.println(ans);
//
//    }
//    static long ans;
//    static void function(long st,long en){
//        if(st>en || st<0 || en>=arr.length){
//            return;
//        }
//      //  System.out.println("function startd");
//        long mid=(st+en)/2;
//        boolean reach=eval(mid);
//     //   System.out.println("eval is "+reach+" for mid "+mid);
//        if(reach){
//            ans=Math.max(ans,temp);
//            function(mid+1,en);
//        }
//        else{
//            function(st,mid-1);
//        }
//    }
//    static long temp;
//    static boolean eval(long mid){
//        if(mid<0 || mid>=arr.length || arr.length==0){
//            return false;
//        }
//        boolean ans=false;
//        long sum=0;
//        long extraHere=0;
//        temp=0;
//
//        int mul= (int) (arr[(int)mid].p/arr[(int)mid].o);
//        long needed=0;
//        for(int i=0;i< arr.length;i++){
//            long val=mul*arr[i].o;
//            if(val>arr[i].p){
//                needed=needed+(val-arr[i].p);
//            }
//            else{
//                ext[i]=arr[i].p-val;
//                extraHere=extraHere+ext[i];
//            }
//            sum=sum+arr[i].o;
//        }
//        if(needed<=k){
//            temp=mul;
//            ans=true;
//            ///how many extras
//            long f=((k-needed)/sum);
//            temp=temp+f;
//            long Kleft=k-needed;
//            Kleft=Kleft-(f*sum);
//            if((extraHere+Kleft)>=sum){
//
//                int count=0;
//                for(int i=0;i<ext.length;i++){
//                    if(ext[i]<arr[i].o && ext[i]+Kleft<arr[i].o){
//                        break;
//                    }
//                    else if(ext[i]<arr[i].o){
//                        Kleft=Kleft+ext[i]-arr[i].o;
//                    }
//                    count++;
//                }
//
//
//                if(count==ext.length){
//                    temp++;
//                }
//            }
//
//
//        }
//
//
//
//        return ans;
//
//    }
//    static public class my implements Comparator<pair>{
//
//        @Override
//        public int compare(pair o1, pair o2) {
//            double d1= (o1.p*1.0)/(o1.o*1.0);
//            double d2= (o2.p*1.0)/(o2.o*1.0);
//            if(d1<d2){
//                return -1;
//            }
//            else if(d1>d2){
//                return 1;
//            }
//            return 0;
//
//        }
//    }
//    static class pair{
//        long o;
//        long p;
//
//    }
}
