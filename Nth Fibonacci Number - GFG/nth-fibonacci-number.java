//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long nthFibonacci(long n){
        // code here
        long[] dp=new long[(int)(n+1)];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
       return nthfibbonacciDp(n,dp);
    }
    static long nthfibbonacciDp(long n,long[] dp){
        if(n==0 || n==1)return n;
        if(dp[(int)n]!=-1)return dp[(int)n]% 1000000007;
            dp[(int)n]=nthfibbonacciDp(n-1,dp)+nthfibbonacciDp(n-2,dp);
            return dp[(int)n]% 1000000007;
    }
}