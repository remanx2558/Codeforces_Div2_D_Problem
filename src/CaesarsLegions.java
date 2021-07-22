import java.util.Scanner;

public class CaesarsLegions {
//https://www.youtube.com/watch?v=AfE1nZjG5ZM
    static long dp[][][][] = new long[101][101][11][11];
    static long mod = 100000000;

    static long recursion(int f , int h , int cnt_f , int cnt_h , int k1 , int k2) {

        if(f+h==0) {
            return 1;
        }

        if(dp[f][h][cnt_f][cnt_h]!=-1) {
            return dp[f][h][cnt_f][cnt_h];
        }

        long ans = 0;

        if(f>0 && cnt_f>0) {
            ans += recursion(f-1,h,cnt_f-1,k2 , k1,k2);
        }

        if(h>0 && cnt_h>0) {

            ans += recursion(f,h-1,k1,cnt_h-1,k1,k2);
        }

        ans = ans%mod;

        return dp[f][h][cnt_f][cnt_h]= ans;
    }

    public static void main(String args[]) throws Exception {


        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();

        for(int i=0;i<=100;i++) {
            for(int j=0;j<=100;j++) {
                for(int k=0;k<=10;k++) {
                    for(int l=0;l<=10;l++) {
                        dp[i][j][k][l] = -1;
                    }
                }
            }
        }

        int tc = 1;

        while(tc-->0) {

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();

            long ans = recursion(n1,n2,k1,k2,k1,k2);

            System.out.println(ans);
        }
        System.out.println(res);

    }
}
