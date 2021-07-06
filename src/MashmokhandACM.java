import java.util.Scanner;

public class MashmokhandACM {
    static node arr[][];
    public static void main(String argrs[]) {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int m=s.nextInt();

        arr=new node[2001][2001];
        filler(n+1,m+2);
        System.out.println(arr[n][m].t);


    }
    static long M=1000000007;
    static void filler(int N,int MM){
        /////horizontal 1st colum

        for(int i=1;i<MM;i++){
            arr[1][i]=new node(1,1,1);
        }
        ////vtical 1st row
        for(int i=1;i<N;i++){
            arr[i][1]=new node(0,1,i);
        }
        //////
        for(int x=2;x<MM;x++){
            for(int y=2;y<N;y++){

                //from up
                long up=(arr[y-1][x].t)%M;
                long total=0;
                long div=0;

                for(int k=y;k>=1;k--){
                    if(y%k==0){
                        div=((div)%M+(arr[k][x-1].d)%M)%M;
                    }
                }
                total=((up%M)+(div%M))%M;
                //System.out.println("y"+y+" x "+x);
                arr[y][x]=new node(up,div,total);
            }
        }


    }
    static class node{
        long u=0;
        long d=0;
        long t=0;
        node(long uu,long dd,long tt){
            u=uu;d=dd;t=tt;
        }
    }
    }
