class Solution {
public:
    int cherryPickup(vector<vector<int>>& grid) {
        int n = grid.size();
        vector<vector<int>> dp(n, vector<int>(n, -1));
        dp[0][0] = grid[0][0]; 
        const int maxK = 2 * (n - 1); 
        for (int k = 1; k <= maxK; k++) { 
            vector<vector<int>> curr(n, vector<int>(n, -1));
            for (int i = 0; i < n && i <= k; i++) {
                if ( k - i >= n) continue;
                for (int j = 0; j < n && j <= k; j++) {
                    if (k - j >= n) continue;
                    if (grid[i][k - i] < 0 || grid[j][k - j] < 0) { 
                        continue;
                    }
                    
                    int cherries = dp[i][j]; 
                    if (i > 0) cherries = std::max(cherries, dp[i - 1][j]);
                    if (j > 0) cherries = std::max(cherries, dp[i][j - 1]);
                    if (i > 0 && j > 0) cherries = std::max(cherries, dp[i - 1][j - 1]);
                    if (cherries < 0) continue;
                    cherries += grid[i][k - i] + (i == j ? 0 : grid[j][k - j]);
                    curr[i][j] = cherries;
                }
            }
            dp = std::move(curr); 
        }
        return std::max(dp[n-1][n-1], 0); 
    }
};