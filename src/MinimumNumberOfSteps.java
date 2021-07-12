import java.util.Scanner;
import java.util.Stack;

public class MinimumNumberOfSteps {

    static Stack<Character> stk;
    static long count;
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        c=0;
        k=0;
        j=1000000007;
        function(str,0);
    }
    static long c,k,j;
    static void function(String str,int i){
      //Each 'b' character makes a number of 'b' characters in the last situation according to the number of 'a' characters before it.
     //The last situation is some 'a' characters after some 'b' ones.
       //It's obvious to prove all 'b's are distinctive to each other
        // (i.e. Each 'b' in the initial state, will add some number of 'b's to the final state
        // disjoint from other 'b's).
        // For a character 'b' from the initial state it will double after seeing a character 'a'.
        // For each i-th character 'b', consider ti the number of a before it.
        for(i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='b')c++;else{
                k+=c;c*=2;k%=j;c%=j;
            }
        }
        System.out.println(k);
    }

}
