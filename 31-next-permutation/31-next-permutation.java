// Number of permutations for a string of lenght n is n! (n factorial).

// Brute Force:
// find all the permutations (time complexity: O(N*N!) ) and then find the next permutation
// of the given permutation.

// Optimised Approach
// find the dip by traversing right to left. (a[i]<a[i+1])
// find the first larger element than dip element from the right side
// swap the larger and dip element
// reverse  (dip index+1 to end of the array)
// Time Complexity: O(N) because we are only traversing an array one time in every loop



class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0){
            if(nums[i]<nums[i+1]){
                break;
            }
            i--;
        }
        if(i==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        int val=nums.length-1;
        for(int k=nums.length-1;k>i;k--){
            if(nums[k]>nums[i]){
                val=k;
                break;
            }
        }
        int temp=nums[i];
        nums[i]=nums[val];
        nums[val]=temp;
        reverse(nums,i+1,nums.length-1);
    }
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}