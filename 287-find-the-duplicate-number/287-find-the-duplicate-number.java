// Brute force:
// for every element, traverse the whole array and check whether it's duplcate exists or not.
// Time Complexity: O(N^2)

// Better Approach:
// Store the values of the arrays in HashMap or in an array and check the frequency of the // // elements.
// Time Complexity: O(N) for traversing the array and storing the values + O(N) for checking
// the frequency 

class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
       do {
            slow=nums[slow];
            fast=nums[nums[fast]];
        } while(slow!=fast);
       System.out.println(slow+" djksd");
        fast=nums[0];
        while(fast!=slow){
            fast=nums[fast];
            slow=nums[slow];
        }
        return slow;
    }
}
