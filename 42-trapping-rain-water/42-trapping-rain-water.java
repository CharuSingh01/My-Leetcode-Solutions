class Solution {
    public int trap(int[] height) {
        int sum=0;
        int[] lmax=new int[height.length];
        int[] rmax=new int[height.length];
        int max=height[0];
        for(int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
            lmax[i]=max;
        }
        max=height[height.length-1];
        for(int i=height.length-1;i>=0;i--){
            max=Math.max(max,height[i]);
            rmax[i]=max;
        }

        for(int i=0;i<height.length;i++){
            sum+=Math.min(rmax[i],lmax[i])-height[i];
        }
        return sum;
    }
}