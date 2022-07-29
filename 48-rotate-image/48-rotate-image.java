// Brute Force Approach:
// Take another 2d matrix and fill it with the first matrix using a particular order
// Time Complexity: O(N^2)
// Space Complexity: O(N^2)

//Optimised Approach:
// Find the transpose of matrix and then reverse each row of the matrix.
// Time Complexity: O(N^2)
// Space Complexity: O(1)



class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i],0,matrix[i].length-1);
        }
    }
    public void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}