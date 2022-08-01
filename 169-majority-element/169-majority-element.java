// Brute Force: 
// for every value, traverse the whole array again and check if the frequency is > n/2
// Time Complexity: O(N^2)

// Better Approach:
// Using HashMap
// Time Complexity: between O(N) to O(NlogN)
// Space Complexity: O(N)

// Optimised Solution
//Moore's Voting Solution
// Cancel out minory elements with majority elements
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int me=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==me)count++;
            else{
                count--;
                if(count==0){
                count=1;
                 me=nums[i];
                }
            }
        }
        return me;
    }
}