class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)==true)continue;
            else{
                int count=0;
                int val=nums[i];
                while(set.contains(val)){
                    count++;
                    val++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}