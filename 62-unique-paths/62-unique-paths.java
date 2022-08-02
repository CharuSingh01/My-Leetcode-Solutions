// Brute Force:
// without using dp, time and space complexity will be exponential in recursion.

// Better Solution:
// by using dp, time and space complexity will be O(N x M)

// Best Solution:
// for total paths (N+M), number of paths exist= N+M-2 C N-1 (combination);

class Solution {
    public int uniquePaths(int m, int n) {
        int u=m+n-2;
        int l=m-1;
        double res=1;
        for(int i=1;i<=l;i++){
            res=res*(u-l+i)/i;
        }
        return (int)res;
    }
    
    
    
    
//     public int uniquePaths(int m, int n) {
//         int[][] dp=new int[m][n];
//         for(int i=0;i<m;i++){
//             Arrays.fill(dp[i],-1);
//         }
//         return solution(0,0,m,n,dp);
        
//     }
   
//     public int solution(int i,int j,int m,int n,int[][]dp){
//         if(i<0 || j<0 || i>=m || j>=n){
//             return 0;
//         }
//         if(i==m-1 && j==n-1){
//             dp[i][j]=1;
//             return 1;
//         }
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         }
//         int val1=solution(i+1,j,m,n,dp);
//         int val2=solution(i,j+1,m,n,dp);
//         dp[i][j]=val1+val2;
//         return dp[i][j];
//     }
}