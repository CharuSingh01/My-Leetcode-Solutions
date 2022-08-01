class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        solution(matrix,target,0,matrix[0].length-1);
        return check;
    }
    boolean check=false;
    public void solution(int[][] matrix,int target,int i,int j){
         if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length){
            return;
        }
        if(matrix[i][j]==target){
            check=true;
            return;
        }
       
        if(matrix[i][j]<target){
            solution(matrix,target,i+1,j);
        }
        else{
              solution(matrix,target,i,j-1);
        }
    }
}