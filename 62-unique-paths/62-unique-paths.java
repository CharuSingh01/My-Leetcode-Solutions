class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solution(0,0,m,n,dp);
        
    }
   
    public int solution(int i,int j,int m,int n,int[][]dp){
        if(i<0 || j<0 || i>=m || j>=n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            dp[i][j]=1;
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int val1=solution(i+1,j,m,n,dp);
        int val2=solution(i,j+1,m,n,dp);
        dp[i][j]=val1+val2;
        return dp[i][j];
    }
}