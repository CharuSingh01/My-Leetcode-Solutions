class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        boolean check=false;
        if(nums[0]==1)
        {count=1;
         check=true;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==1)check=true;;
            if(nums[i]==1 && nums[i]==nums[i-1]){
                count++;
           
            }
            else{
                max=Math.max(max,count);
                count=1;
            }
        }
        if(check==false)return 0;
        max=Math.max(max,count);
        return max;
    }
}