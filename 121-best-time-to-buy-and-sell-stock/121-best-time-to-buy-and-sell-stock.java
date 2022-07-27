// Brute Force Approach: 
// find all pairs and get the value (sell-buy), and find the max value.
// Time Complexity: O(N^2)

// class Solution {
//     public int maxProfit(int[] prices) {
//         int ans=0;
//         for(int i=0;i<prices.length-1;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 int value=prices[j]-prices[i];
//                 ans=Math.max(value,ans);
//             }
//         }
//         return ans;
//     }
// }

// Optimised Solution:
// take two variables, BestStock and CurrStock.
// Take a variable min which will always update it's value to the minimum value of array 
// while traversing the array.
// CurrStock= current element-min
// update the BestStock by max(BestStock, CurrStock)


class Solution {
    public int maxProfit(int[] prices) {
        int bestStock=0;
        int currStock=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            currStock=prices[i]-min;
            bestStock=Math.max(bestStock,currStock);
        }
        return bestStock;
    }
}