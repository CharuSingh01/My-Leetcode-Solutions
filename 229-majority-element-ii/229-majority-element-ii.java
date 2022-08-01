class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int c2=0;
        int n1=Integer.MIN_VALUE;
        int n2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==n1){
                c1++;
            }
            else if(nums[i]==n2){
                c2++;
            }
              else if(c1==0){
                n1=nums[i];
                c1++;
            }
            else if(c2==0){
                n2=nums[i];
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> ans=new ArrayList<>();
        int v1=0;
        int v2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n1){
                v1++;
            }
            if(nums[i]==n2){
                v2++;
            }
        }
        if(v1>nums.length/3){
            ans.add(n1);
        }
        if(v2>nums.length/3){
            ans.add(n2);
        }
        return ans;
    }
}