import java.util.Scanner;

public class Flowers {
    static long dp[];
    static long dp2[];
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int k=s.nextInt();
        dp=new long[100001];
        dp2=new long[100001];

        for(int i=1;i<k;i++){
            dp[i]=1;
            dp2[i]=i;
        }
        if(k<100001){
            dp[k]=2;
            dp2[k]=k+1;
        }
        int M=1000000007;
        for(int i=k+1;i<100001;i++){
            dp[i]=(dp[i-1]%M+dp[i-k]%M)%M;
            dp2[i]=(dp2[i-1]%M+dp[i]%M)%M;
        }

        for(int p=0;p<t;p++){
            int st=s.nextInt();
            int end=s.nextInt();
            long ans=dp2[end]-dp2[st-1];

            System.out.println(ans);
        }


    }
    }
