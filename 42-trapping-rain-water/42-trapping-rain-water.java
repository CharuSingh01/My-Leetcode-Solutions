class Solution {
    //brute force : time complexity : O(N^2)
    
    // better approach 
    // use two arrays lmax and rmax
    // Time Complexity: O(N)
    // Space Complexity: O(2N)
    
//     public int trap(int[] height) {
//         int sum=0;
//         int[] lmax=new int[height.length];
//         int[] rmax=new int[height.length];
//         int max=height[0];
//         for(int i=0;i<height.length;i++){
//             max=Math.max(max,height[i]);
//             lmax[i]=max;
//         }
//         max=height[height.length-1];
//         for(int i=height.length-1;i>=0;i--){
//             max=Math.max(max,height[i]);
//             rmax[i]=max;
//         }

//         for(int i=0;i<height.length;i++){
//             sum+=Math.min(rmax[i],lmax[i])-height[i];
//         }
//         return sum;
//     }
// }
    
     public int trap(int[] height) {
         int n=height.length;
         int l=0;
         int r=n-1;
         int lmax=0;
         int rmax=0;
         int sum=0;
         while(l<=r){
             if(height[l]<=height[r]){
                 if(height[l]>=lmax){
                     lmax=height[l];
                 }
                 else{
                     sum+=lmax-height[l];
                 }
                 l++;
             }
             else{
                 if(height[r]>=rmax){
                     rmax=height[r];
                 }
                 else{
                     sum+=rmax-height[r];
                 }
                 r--;
                 
             }
         }
         return sum;
     }
}
