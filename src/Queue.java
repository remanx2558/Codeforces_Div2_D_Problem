import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Queue {
//    public static void main(String args[]){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        PriorityQueue<Long>pq=new PriorityQueue<Long>();
//        for(int i=0;i<n;i++){
//            pq.add(s.nextLong());
//        }
//        long time=0;
//        int count=1;
//        int countarr[]=new int [n];
//        long timearr[]=new long [n];
//
//        if(n>0){
//            countarr[0]=1;
//            timearr[0]= pq.poll();
//        }
//        int index=1;
//        while(pq.isEmpty()==false){
//            long val=pq.poll();
//            if(val>=time){
//                count++;
//            }
//            time=time+val;
//
//            index++;
//        }
//        System.out.println(count);
//    }
//
public static void main(String args[]){
    Scanner s1=new Scanner(System.in);
    int n=s1.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s1.nextInt();
    }
    Arrays.sort(arr);
    long sum=0,count=0;
    for(int i=0;i<n;i++){
        int ext=arr[i];
        if(sum<=ext){
            sum+=ext;
            count++;
        }
    }
    System.out.println(count);
}
}
