import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class XoringNinja {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long mod=1000000007;
        int t = sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
           // long sum=0;
            long or=0;
            long temp=1;
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong()%mod;
                //a[i]%=mod;
            }
            for(int i=0;i<n;i++){
                or=(a[i]|or)%mod;
            }
            n-=1;
            for(int i=0;i<n;i++){
                or=(or*2)%mod;   
            }
            System.out.println(or%mod);
        }
    }
}