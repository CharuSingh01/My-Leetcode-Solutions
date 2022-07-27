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
        //System.out.println(i+" "+val);
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