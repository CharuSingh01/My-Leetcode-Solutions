// Brute Force: 
// Traverse the whole array
// Time Complexity: O(N^2)

// Better Approach:
// Apply binary search on each row
// Time complexity: N x log(M)

//Optimized Solution:

//RECURSION:
// set the pointers i and j at 1st row and last column.
// if target<arr[i][j] decrease j
//if target>arr[i][j] increase i

//Iterative:
//Assume it's a sorted 1d array with index of range 0 to (NxM-1)
//Appply binary search and to find out index i and j, 
// i= index/M
// j= index % M
// Time Complexity: log(N x M) 

class Solution {
     public boolean searchMatrix(int[][] matrix, int target) {
         int n=matrix.length;
         int m=matrix[0].length;
         if(n==0)return false;
         int lo=0;
         int hi=(n*m)-1;
         while(lo<=hi){
             int mid=lo+(hi-lo)/2;
             int rowidx=mid/m;
             int colidx=mid%m;
             if(matrix[rowidx][colidx]==target)return true;
             else if(matrix[rowidx][colidx]<target){
                 lo=mid+1;
             }
             else{
                 hi=mid-1;
             }
         }
         return false;
     }
    
//     public boolean searchMatrix(int[][] matrix, int target) {
//         solution(matrix,target,0,matrix[0].length-1);
//         return check;
//     }
//     boolean check=false;
//     public void solution(int[][] matrix,int target,int i,int j){
//          if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length){
//             return;
//         }
//         if(matrix[i][j]==target){
//             check=true;
//             return;
//         }
       
//         if(matrix[i][j]<target){
//             solution(matrix,target,i+1,j);
//         }
//         else{
//               solution(matrix,target,i,j-1);
//         }
//     }
}