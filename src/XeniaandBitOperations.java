import java.util.Scanner;

public class XeniaandBitOperations {
    public static void main(String argrs[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int siz=(int)Math.pow(2,n);
        //////////////////////////
        hsiz=(2*siz)-1;
        hep=new int[hsiz];

        int k=hsiz-1;
        for(int i=0;k>0 && i<siz;k--,i++){
            hep[k]=s.nextInt();
        }
        ////1st time fullfillment/////
        greed(k,n,m,siz);
        ////querries////
        for(int i=0;i<m;i++){
            int p=s.nextInt()-1;
            p=hsiz-p-1;
            int b=s.nextInt();
            function(p,b,false);
            System.out.println(hep[0]);
        }
    }
    static int hep[];
    static int hsiz;
    static void greed(int k,int n,int m,int siz){

        /////////////////////
        boolean xor=false;
        int tc=siz/2;
        int count=0;

        for(;k>=0;k--){
            int c1=2*k+1;
            int c2=c1+1;

            if(xor==false && c2>=0 && c1>=0 && c1<hsiz && c2<hsiz){
                hep[k]=hep[c1]|hep[c2];
            }
            else if( c2>=0 && c1>=0 && c1<hsiz && c2<hsiz){
                hep[k]=hep[c1]^hep[c2];
            }
            count++;
            if(count==tc){
                count=0;
                tc=tc/2;
                xor=!xor;

            }
        }
    }
    static void function(int p,int b,boolean xor){

        if(p<0 || p>=hsiz){
            return;
        }
        if(b==hep[p]){
            return;
        }

        hep[p]=b;
        if(p==0){
            //System.out.println(hep[p]);
            return;
        }


        int parent=(p-1)/2;
        int c1=2*parent+1;
        int c2=c1+1;
        if(c1>=0 && c2>=0 && c1<hsiz && c2<hsiz && parent>=0 && parent<hsiz){

            int val=0;
            if(xor==false){
                val=hep[c1]|hep[c2];
            }
            else{
                val=hep[c1]^hep[c2];

            }
            function(parent,val,!xor);
        }
        return;


    }
}
