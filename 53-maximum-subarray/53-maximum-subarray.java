// Brute Force:
// Find the sum of all subarrays and find the maximum sum.
// Time Complexity: O(N^3)

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int ans=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){
//                     sum+=nums[k];
//                 }
//                 ans=Math.max(sum,ans);
//             }
//         }
//         return ans;
//     }
// }

// Optimised Solution: Kadagne's Algorithm


class Solution {
    public int maxSubArray(int[] nums) {
        int bestSum=nums[0];
        int currSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<currSum+nums[i]){
                currSum+=nums[i];
            }
            else{
                currSum=nums[i];
            }
            bestSum=Math.max(bestSum,currSum);
        }
        return bestSum;
    }
}