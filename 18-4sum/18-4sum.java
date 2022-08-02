// Brute Force Approach:
// sort the array
// take three loops i , j , k and initialise them with i=0, j=i+1, k=j+1
// take sum of a[i] , a[j] , a[k] and for the remaining right part of array,
// apply binary search.
// Time Complexity:
// O(N^3*log(N))
// for unique quadruplets, use HashSet

// Optimised Solution:
// sort the array
// take two loops i and j and initialise them with i=0 and j=i+1
// in the remaining right array use the left and right pointer approach(two sum) 
// to find the remaining sum.
// in all these loops , always increase the counter if the next element is of same value
// to avoid dupllicates
// Time Complexity:
// O(N^3)


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         List<List<Integer>> ans=new ArrayList<>();
        if(nums.length==0 || nums==null){
            return null;
        }
        if(nums.length<4){
            return ans;
        }
        int n=nums.length;
        Arrays.sort(nums);
        
       
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long mySum=nums[i]+nums[j];
                long remSum=target-mySum;
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=nums[left]+nums[right];
                    if(sum<remSum){
                        left++;
                    }
                    else if(sum>remSum){
                        right--;
                    }
                    else{
                        List<Integer> ele=new ArrayList<>();
                        ele.add(nums[i]);
                        ele.add(nums[j]);
                        ele.add(nums[left]);
                        ele.add(nums[right]);
                        ans.add(ele);
                    while(left<right && nums[left]==ele.get(2)){
                            left++;
                        }
                     while(left<right && nums[right]==ele.get(3)){
                            right--;
                        }
                    }
                }
                while(j<n-1 && nums[j]==nums[j+1]){
                    j++;
                }
            }
            while(i<n-1 && nums[i]==nums[i+1]){
                i++;
            }
        }
        return ans;
        
    }
}