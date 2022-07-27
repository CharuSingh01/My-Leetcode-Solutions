//Brute Force:
//Sort the array (lmao)
// Time Complexity: O(NlogN)

//Another Approach
// count the number of 0's , 1's , 2's using HashMap and then fill the array with these 
// numbers in the required order.
//Time Complexity: O(N)+O(N)

// Best Approach
// make three pointers i,j,k  (i=0, j=0, k=array.length-1)
// if arr[i]=0  swap i,j  i++  j++
// if arr[i]=1  i++
// if arr[i]=2  swap i,k  k-- 
// loop will run while i<=k


class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(i<=k){
            if(nums[i]==0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                swap(nums,i,k);
                k--;
            }
        }
        
        
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}