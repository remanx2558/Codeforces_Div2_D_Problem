import java.util.Arrays;
import java.util.Scanner;

public class EquivalentStrings
{
    ///my solution giving TLE at testcase 89 : No need to use recurrsion aggain and again
    //just sort strings using recursion******to its minimal form can go then just compare.

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        boolean ans;
        if(smallest(a).equals(smallest(b))){
            ans = true;
        } else {
            ans = false;
        }

        if(ans){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
//        if(function(a,b)){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
    }

    private static String smallest(String s) {
        if (s.length() % 2 == 1) return s;
        String s1 = smallest(s.substring(0, s.length()/2));
        String s2 = smallest(s.substring(s.length()/2, s.length()));
        String[] arr = new String[]{s1,s2};
        Arrays.sort(arr);
        return arr[0] + "" + arr[1];
    }

    static boolean function(String a, String b){
        if(a.equals(b)){
            return true;
        }
        if(a.length()!=b.length()){
            return false;
        }
        int n=a.length();
        if(function(a.substring(0,(n/2)),b.substring(0,(n/2)))&&function(a.substring(n/2,n),b.substring((n/2),n))){
            return true;
        }

        if(function(a.substring(0,(n/2)),b.substring((n/2),n))&&function(a.substring(n/2,n),b.substring(0,(n/2)))){
            return true;
        }

        return false;

    }
}
