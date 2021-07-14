import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class DimaandLisa {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();

        ArrayList<Long> list=new ArrayList<>();
        ////check a
        BigInteger big=new BigInteger(""+a);
        if(big.isProbablePrime(20)){
            list.add(a);
        }
        else{
            ////any prime
            for(long i=a-1;i>=2;i--){
                BigInteger big2=new BigInteger(""+i);

                if(big2.isProbablePrime(20)){
                    list.add(i);
                    a-=i;
                    break;
                }
            }
            ///have modiefied a
            BigInteger big3=new BigInteger(""+a);

            if(big3.isProbablePrime(20)){
                list.add(a);
            }
            else{
                for(long i=a-1;i>=2;i--){
                    BigInteger big4=new BigInteger(""+i);
                    BigInteger big5=new BigInteger(""+(a-i));

                    if(big4.isProbablePrime(20)&&big5.isProbablePrime(20)){
                        list.add(i);
                        list.add(a-i);
                        break;
                    }
                }
            }
        }

        ///print answer
        System.out.println(list.size());
        for(long u:list){
            System.out.print(u+" ");
        }
    }
}