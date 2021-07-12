import java.util.Scanner;

public class RPDandRapSheetEasyVersion {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int p=0;p<t;p++){
            System.out.flush();
            int n=s.nextInt();
            int k=s.nextInt();
            greed(n,k);
            System.out.flush();
        }

    }
    static void greed(int n,int k){
        Scanner s=new Scanner(System.in);

        System.out.println(0);
        System.out.flush();
        boolean ans=false;
        int res=s.nextInt();
        if(res==-1||res==1){
            return;
        }

        for(int newguess=1;newguess<=n;newguess++){
            int cumguess=(newguess-1)^newguess;
            System.out.println(cumguess);
            System.out.flush();
            res=s.nextInt();

            if(res==-1||res==1){
                System.out.flush();
                return;
            }

        }

    }

}
