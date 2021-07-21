//import java.util.Scanner;
//
//public class SoldierandNumberGame {
////    public static void main(String args[]) {
////        Scanner s=new Scanner(System.in);
////        int t=s.nextInt();
////        int m=5000000;
////        sieveOfEratosthenes(m);
////        for(int i=0;i<t;i++){
////            int a=s.nextInt();
////            int b=s.nextInt();
////            function(a,b);
////        }
////    }
////    static void function(int a,int b){
////
////        long count=0;
////        int arr[]=new int[a-b];
////        int val=a;
////        for(int i=0;i<arr.length;i++){
////            arr[i]=val;
////            val--;
////          //  System.out.print(arr[i]+" ");
////        }
////       // System.out.println("break");
////
////            for(int p=a;p>=2;p--){
////                if(prime[p]){
////                 //   System.out.println(p+" its a prime");
////                    for(int i=0;i<arr.length;i++){
////                        while(arr[i]%p==0){
////                            count++;
////                            arr[i]=arr[i]/p;
////                        }
////                    }
////                }
////            }
////
////
////        System.out.println(count);
////    }
////    static boolean prime[];
////    static void sieveOfEratosthenes(int n)
////    {
////        // Create a boolean array
////        // "prime[0..n]" and
////        // initialize all entries
////        // it as true. A value in
////        // prime[i] will finally be
////        // false if i is Not a
////        // prime, else true.
////        prime = new boolean[n + 1];
////        for (int i = 0; i <= n; i++)
////            prime[i] = true;
////
////        for (int p = 2; p * p <= n; p++)
////        {
////            // If prime[p] is not changed, then it is a
////            // prime
////            if (prime[p] == true)
////            {
////                // Update all multiples of p
////                for (int i = p * p; i <= n; i += p)
////                    prime[i] = false;
////            }
////        }
//////
//////        // Print all prime numbers
//////        for (int i = 2; i <= n; i++)
//////        {
//////            if (prime[i] == true)
//////                System.out.print(i + " ");
//////        }
////    }
//
//    public static int mod = (int) (1e9+7);
//    public static int[] p = new int[5000001];
//    public static int[] sp = new int[5000001];
//
//    public static void isPrime(){
//        p[0]=-1;
//        p[1]=-1;
//        for(int i=2;i<p.length;i++){
//            if(p[i]!=-1){
//                sp[i]=i;
//                p[i]=1;
//                for(int j=2*i;j<p.length;j+=i){
//                    p[j]=-1;
//                    if(sp[j]==0) sp[j]=i;
//                }
//            }
//        }
//    }
//    public static long lognPrimeFactorisation(int n){
//        long c=0;
//
//        for(int i=sp[n];i<=Math.sqrt(n) && i!=0;i=sp[n]){
//            if(n%i==0){
//                while(n%i==0) {
//                    n/=i;
//                    c++;
//                }
//            }
//        }
//        if(n>=2) c++;
//        return c;
//    }
//
//    public static void main(String[] args) {
//        new Thread(null ,new Runnable(){
//            public void run(){
//                try{
//                    solve();
//                } catch(Exception e){
//                    e.printStackTrace();
//                }
//            }
//        },"1",1<<26).start();
//    }
//
//    public static void solve() {
//
//        InputReader in = new InputReader(System.in);
//        PrintWriter out = new PrintWriter(System.out);
//
//        isPrime();
//        long[] arr=new long[5000001];
//        for(int i=2;i<arr.length;i++){
//            arr[i]=lognPrimeFactorisation(i);
//            arr[i]+=arr[i-1];
//        }
//        int t=in.nextInt();
//
//        while(t-->0){
//            int a=in.nextInt();
//            int b=in.nextInt();
//            out.println((arr[a]-arr[b]));
//        }
//
//        out.close();
//    }
//
//    static class Pair implements Comparable<Pair>{
//
//        int x,y,i;
//
//        Pair (int x,int y,int i){
//            this.x=x;
//            this.y=y;
//            this.i=i;
//        }
//
//        Pair (int x,int y){
//            this.x=x;
//            this.y=y;
//        }
//
//        public int compareTo(Pair o) {
//            if(this.x!=o.x)
//                return Integer.compare(this.x,o.x);
//            else
//                return Integer.compare(this.y,o.y);
//            //return 0;
//        }
//
//        public boolean equals(Object o) {
//            if (o instanceof Pair) {
//                Pair p = (Pair)o;
//                return p.x == x && p.y == y && p.i==i;
//            }
//            return false;
//        }
//        public int hashCode() {
//            return new Integer(x).hashCode() * 31 + new Integer(y).hashCode()+new Integer(i).hashCode()*37;
//        }
//
//    }
//
//
//    public static boolean isPal(String s){
//        for(int i=0, j=s.length()-1;i<=j;i++,j--){
//            if(s.charAt(i)!=s.charAt(j)) return false;
//        }
//        return true;
//    }
//    public static String rev(String s){
//        StringBuilder sb=new StringBuilder(s);
//        sb.reverse();
//        return sb.toString();
//    }
//
//    public static long gcd(long x,long y){
//        if(x%y==0)
//            return y;
//        else
//            return gcd(y,x%y);
//    }
//
//    public static int gcd(int x,int y){
//        if(x%y==0)
//            return y;
//        else
//            return gcd(y,x%y);
//    }
//
//    public static long gcdExtended(long a,long b,long[] x){
//
//        if(a==0){
//            x[0]=0;
//            x[1]=1;
//            return b;
//        }
//        long[] y=new long[2];
//        long gcd=gcdExtended(b%a, a, y);
//
//        x[0]=y[1]-(b/a)*y[0];
//        x[1]=y[0];
//
//        return gcd;
//    }
//
//    public static int abs(int a,int b){
//        return (int)Math.abs(a-b);
//    }
//
//    public static long abs(long a,long b){
//        return (long)Math.abs(a-b);
//    }
//
//    public static int max(int a,int b){
//        if(a>b)
//            return a;
//        else
//            return b;
//    }
//
//    public static int min(int a,int b){
//        if(a>b)
//            return b;
//        else
//            return a;
//    }
//
//    public static long max(long a,long b){
//        if(a>b)
//            return a;
//        else
//            return b;
//    }
//
//    public static long min(long a,long b){
//        if(a>b)
//            return b;
//        else
//            return a;
//    }
//
//    public static long pow(long n,long p,long m){
//        long  result = 1;
//        if(p==0)
//            return 1;
//        if (p==1)
//            return n;
//        while(p!=0)
//        {
//            if(p%2==1)
//                result *= n;
//            if(result>=m)
//                result%=m;
//            p >>=1;
//            n*=n;
//            if(n>=m)
//                n%=m;
//        }
//        return result;
//    }
//
//    public static long pow(long n,long p){
//        long  result = 1;
//        if(p==0)
//            return 1;
//        if (p==1)
//            return n;
//        while(p!=0)
//        {
//            if(p%2==1)
//                result *= n;
//            p >>=1;
//            n*=n;
//        }
//        return result;
//    }
//
//    static class InputReader {
//
//        private final InputStream stream;
//        private final byte[] buf = new byte[8192];
//        private int curChar, snumChars;
//        private SpaceCharFilter filter;
//
//        public InputReader(InputStream stream) {
//            this.stream = stream;
//        }
//
//        public int snext() {
//            if (snumChars == -1)
//                throw new InputMismatchException();
//            if (curChar >= snumChars) {
//                curChar = 0;
//                try {
//                    snumChars = stream.read(buf);
//                } catch (IOException e) {
//                    throw new InputMismatchException();
//                }
//                if (snumChars <= 0)
//                    return -1;
//            }
//            return buf[curChar++];
//        }
//
//        public int nextInt() {
//            int c = snext();
//            while (isSpaceChar(c)) {
//                c = snext();
//            }
//            int sgn = 1;
//            if (c == '-') {
//                sgn = -1;
//                c = snext();
//            }
//            int res = 0;
//            do {
//                if (c < '0' || c > '9')
//                    throw new InputMismatchException();
//                res *= 10;
//                res += c - '0';
//                c = snext();
//            } while (!isSpaceChar(c));
//            return res * sgn;
//        }
//
//        public long nextLong() {
//            int c = snext();
//            while (isSpaceChar(c)) {
//                c = snext();
//            }
//            int sgn = 1;
//            if (c == '-') {
//                sgn = -1;
//                c = snext();
//            }
//            long res = 0;
//            do {
//                if (c < '0' || c > '9')
//                    throw new InputMismatchException();
//                res *= 10;
//                res += c - '0';
//                c = snext();
//            } while (!isSpaceChar(c));
//            return res * sgn;
//        }1234556789890,mm,cxmncx,vn,mnglrr'
//
//
//        public static int mod = (int) (1e9+7);
//        public static int[] p = new int[5000001];
//        public static int[] sp = new int[5000001];
//
//        public static void isPrime(){
//            p[0]=-1;
//            p[1]=-1;
//            for(int i=2;i<p.length;i++){
//                if(p[i]!=-1){
//                    sp[i]=i;
//                    p[i]=1;
//                    for(int j=2*i;j<p.length;j+=i){
//                        p[j]=-1;
//                        if(sp[j]==0) sp[j]=i;
//                    }
//                }
//            }
//        }
//        public static long lognPrimeFactorisation(int n){
//            long c=0;
//
//            for(int i=sp[n];i<=Math.sqrt(n) && i!=0;i=sp[n]){
//                if(n%i==0){
//                    while(n%i==0) {
//                        n/=i;
//                        c++;
//                    }
//                }
//            }
//            if(n>=2) c++;
//            return c;
//        }
//
//        public static void main(String[] args) {
//            new Thread(null ,new Runnable(){
//                public void run(){
//                    try{
//                        solve();
//                    } catch(Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            },"1",1<<26).start();
//        }
//
//        public static void solve() {
//
//            InputReader in = new InputReader(System.in);
//            PrintWriter out = new PrintWriter(System.out);
//
//            isPrime();
//            long[] arr=new long[5000001];
//            for(int i=2;i<arr.length;i++){
//                arr[i]=lognPrimeFactorisation(i);
//                arr[i]+=arr[i-1];
//            }
//            int t=in.nextInt();
//
//            while(t-->0){
//                int a=in.nextInt();
//                int b=in.nextInt();
//                out.println((arr[a]-arr[b]));
//            }
//
//            out.close();
//        }
//
//        static class Pair implements Comparable<Pair>{
//
//            int x,y,i;
//
//            Pair (int x,int y,int i){
//                this.x=x;
//                this.y=y;
//                this.i=i;
//            }
//
//            Pair (int x,int y){
//                this.x=x;
//                this.y=y;
//            }
//
//            public int compareTo(Pair o) {
//                if(this.x!=o.x)
//                    return Integer.compare(this.x,o.x);
//                else
//                    return Integer.compare(this.y,o.y);
//                //return 0;
//            }
//
//            public boolean equals(Object o) {
//                if (o instanceof Pair) {
//                    Pair p = (Pair)o;
//                    return p.x == x && p.y == y && p.i==i;
//                }
//                return false;
//            }
//            public int hashCode() {
//                return new Integer(x).hashCode() * 31 + new Integer(y).hashCode()+new Integer(i).hashCode()*37;
//            }
//
//        }
//
//
//        public static boolean isPal(String s){
//            for(int i=0, j=s.length()-1;i<=j;i++,j--){
//                if(s.charAt(i)!=s.charAt(j)) return false;
//            }
//            return true;
//        }
//        public static String rev(String s){
//            StringBuilder sb=new StringBuilder(s);
//            sb.reverse();
//            return sb.toString();
//        }
//
//        public static long gcd(long x,long y){
//            if(x%y==0)
//                return y;
//            else
//                return gcd(y,x%y);
//        }
//
//        public static int gcd(int x,int y){
//            if(x%y==0)
//                return y;
//            else
//                return gcd(y,x%y);
//        }
//
//        public static long gcdExtended(long a,long b,long[] x){
//
//            if(a==0){
//                x[0]=0;
//                x[1]=1;
//                return b;
//            }
//            long[] y=new long[2];
//            long gcd=gcdExtended(b%a, a, y);
//
//            x[0]=y[1]-(b/a)*y[0];
//            x[1]=y[0];
//
//            return gcd;
//        }
//
//        public static int abs(int a,int b){
//            return (int)Math.abs(a-b);
//        }
//
//        public static long abs(long a,long b){
//            return (long)Math.abs(a-b);
//        }
//
//        public static int max(int a,int b){
//            if(a>b)
//                return a;
//            else
//                return b;
//        }
//
//        public static int min(int a,int b){
//            if(a>b)
//                return b;
//            else
//                return a;
//        }
//
//        public static long max(long a,long b){
//            if(a>b)
//                return a;
//            else
//                return b;
//        }
//
//        public static long min(long a,long b){
//            if(a>b)
//                return b;
//            else
//                return a;
//        }
//
//        public static long pow(long n,long p,long m){
//            long  result = 1;
//            if(p==0)
//                return 1;
//            if (p==1)
//                return n;
//            while(p!=0)
//            {
//                if(p%2==1)
//                    result *= n;
//                if(result>=m)
//                    result%=m;
//                p >>=1;
//                n*=n;
//                if(n>=m)
//                    n%=m;
//            }
//            return result;
//        }
//
//        public static long pow(long n,long p){
//            long  result = 1;
//            if(p==0)
//                return 1;
//            if (p==1)
//                return n;
//            while(p!=0)
//            {
//                if(p%2==1)
//                    result *= n;
//                p >>=1;
//                n*=n;
//            }
//            return result;
//        }
//
//        static class InputReader {
//
//            private final InputStream stream;
//            private final byte[] buf = new byte[8192];
//            private int curChar, snumChars;
//            private SpaceCharFilter filter;
//
//            public InputReader(InputStream stream) {
//                this.stream = stream;
//            }
//
//            public int snext() {
//                if (snumChars == -1)
//                    throw new InputMismatchException();
//                if (curChar >= snumChars) {
//                    curChar = 0;
//                    try {
//                        snumChars = stream.read(buf);
//                    } catch (IOException e) {
//                        throw new InputMismatchException();
//                    }
//                    if (snumChars <= 0)
//                        return -1;
//                }
//                return buf[curChar++];
//            }
//
//            public int nextInt() {
//                int c = snext();
//                while (isSpaceChar(c)) {
//                    c = snext();
//                }
//                int sgn = 1;
//                if (c == '-') {
//                    sgn = -1;
//                    c = snext();
//                }
//                int res = 0;
//                do {
//                    if (c < '0' || c > '9')
//                        throw new InputMismatchException();
//                    res *= 10;
//                    res += c - '0';
//                    c = snext();
//                } while (!isSpaceChar(c));
//                return res * sgn;
//            }
//
//            public long nextLong() {
//                int c = snext();
//                while (isSpaceChar(c)) {
//                    c = snext();
//                }
//                int sgn = 1;
//                if (c == '-') {
//                    sgn = -1;
//                    c = snext();
//                }
//                long res = 0;
//                do {
//                    if (c < '0' || c > '9')
//                        throw new InputMismatchException();
//                    res *= 10;
//                    res += c - '0';
//                    c = snext();
//                } while (!isSpaceChar(c));
//                return res * sgn;
//            }
//
//            public int[] nextIntArray(int n) {
//                int a[] = new int[n];
//                for (int i = 0; i < n; i++) {
//                    a[i] = nextInt();
//                }
//                return a;
//            }
//
//            public long[] nextLongArray(int n) {
//                long a[] = new long[n];
//                for (int i = 0; i < n; i++) {
//                    a[i] = nextLong();
//                }
//                return a;
//            }
//
//            public String readString() {
//                int c = snext();
//                while (isSpaceChar(c)) {
//                    c = snext();
//                }
//                StringBuilder res = new StringBuilder();
//                do {
//                    res.appendCodePoint(c);
//                    c = snext();
//                } while (!isSpaceChar(c));
//                return res.toString();
//            }
//
//            public String nextLine() {
//                int c = snext();
//                while (isSpaceChar(c))
//                    c = snext();
//                StringBuilder res = new StringBuilder();
//                do {
//                    res.appendCodePoint(c);
//                    c = snext();
//                } while (!isEndOfLine(c));
//                return res.toString();
//            }
//
//            public boolean isSpaceChar(int c) {
//                if (filter != null)
//                    return filter.isSpaceChar(c);
//                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
//            }
//
//            private boolean isEndOfLine(int c) {
//                return c == '\n' || c == '\r' || c == -1;
//            }
//
//            public interface SpaceCharFilter {
//                public boolean isSpaceChar(int ch);
//            }
//        }
//    }
//    public int[] nextIntArray(int n) {
//            int a[] = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = nextInt();
//            }
//            return a;
//        }
//
//        public long[] nextLongArray(int n) {
//            long a[] = new long[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = nextLong();
//            }
//            return a;
//        }
//
//        public String readString() {
//            int c = snext();
//            while (isSpaceChar(c)) {
//                c = snext();
//            }
//            StringBuilder res = new StringBuilder();
//            do {
//                res.appendCodePoint(c);
//                c = snext();
//            } while (!isSpaceChar(c));
//            return res.toString();
//        }
//
//        public String nextLine() {
//            int c = snext();
//            while (isSpaceChar(c))
//                c = snext();
//            StringBuilder res = new StringBuilder();
//            do {
//                res.appendCodePoint(c);
//                c = snext();
//            } while (!isEndOfLine(c));
//            return res.toString();
//        }
//
//        public boolean isSpaceChar(int c) {
//            if (filter != null)
//                return filter.isSpaceChar(c);
//            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
//        }
//
//        private boolean isEndOfLine(int c) {
//            return c == '\n' || c == '\r' || c == -1;
//        }
//
//        public interface SpaceCharFilter {
//            public boolean isSpaceChar(int ch);
//        }
//    }
//}
