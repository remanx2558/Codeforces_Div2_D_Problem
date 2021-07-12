import java.util.Arrays;
import java.util.Scanner;

public class Tetrahedron {
    static long Fdp[];
    static long Gdp[];
    public static void main(String args[]) {
        Fdp=new long[10000001];
        Gdp=new long[10000001];
        Arrays.fill(Fdp,-1);
        Arrays.fill(Gdp,-1);
        Fdp[1]=0;
        Fdp[2]=3;
        Fdp[0]=0;
        Gdp[0]=0;
        Gdp[1]=1;
        Gdp[2]=2;
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long ans=function((int)n);
        System.out.println(ans);
    }
    static long function(int n){
        long M=1000000007;
        if(Fdp[n]!=-1){
            return Fdp[n];
        }
        long val=gunction(n-1)%M;
        long ans=(((val+val)%M)+val)%M;
        return ans;
    }
    static long gunction(int n){
        long M=1000000007;
        if(Gdp[n]!=-1){
            return Gdp[n];
        }
        long val=gunction(n-1)%M;
        long val2=function(n-1)%M;
        long ans=(((val+val)%M)+val2)%M;
        return ans;
    }
    }
