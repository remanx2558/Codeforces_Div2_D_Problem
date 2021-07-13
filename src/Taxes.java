import java.math.BigInteger;
import java.util.Scanner;

public class Taxes {
    // Driver Code
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        long n=s.nextInt();long m=n;

        int ans=0;

        BigInteger big=new BigInteger(""+n);
        BigInteger big2=new BigInteger(""+(n-2));
       // if(isPrime((int)n)) ans=1;
        if(big.isProbablePrime(1)) ans=1;
        else if(n%2==0) ans=2;
        else if(big2.isProbablePrime(1)) ans=2;
        else ans=3;
        System.out.println(ans);
    }

    static boolean isPrime(int n)
    {
        // Corner cas
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

}
