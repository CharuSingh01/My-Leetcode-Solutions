// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int n=matrix.length;
//         int m=matrix[0].length;
//         HashSet<Integer> rows=new HashSet<>();
//         HashSet<Integer> cols=new HashSet<>();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                  if(matrix[i][j]==0){
//                    rows.add(i);
//                      cols.add(j);
//                }
//             }
//         }
//            for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                if(rows.contains(i) || cols.contains(j)){
//                    matrix[i][j]=0;
//                }
//             }
//         }
//     }
// }

class Solution {
    // n --> row
    // m --> col
    
     public void setZeroes(int[][] matrix) {
         int n=matrix.length;
         int m=matrix[0].length;
         boolean dc=true;
         boolean dr=true;
         for(int i=0;i<n;i++){
             if(matrix[i][0]==0){
                 dc=false;
             }
         }
        for(int j=0;j<m;j++){
             if(matrix[0][j]==0){
                 dr=false;
             }
         }
         for(int i=1;i<n;i++){
             for(int j=1;j<m;j++){
                 if(matrix[i][j]==0){
                     matrix[i][0]=0;
                     matrix[0][j]=0;
                 }
             }
         }
         for(int i=1;i<n;i++){
             for(int j=1;j<m;j++){
                 if(matrix[i][0]==0 || matrix[0][j]==0){
                     matrix[i][j]=0;
                 }
             }
         }
         if(dr==false){
             for(int j=0;j<m;j++){
             matrix[0][j]=0;
                 }
         }
             if(dc==false){
                 for(int i=0;i<n;i++){
                     matrix[i][0]=0;
                 }
             }
         }
         
         
         
         
         
     }
//     public void setZeroes(int[][] matrix) {
//         int dummyCol=1;
//         int dummyRow=1;
//         int n=matrix.length;
//         int m=matrix[0].length;
//         if(matrix[0][0]==0){
//             dummyCol=0;
//             dummyRow=0;
//         }
//         for(int i=1;i<n;i++){
//             if(matrix[i][0]==0)dummyCol=0;
         
//             for(int j=1;j<m;j++){
//                  if(matrix[0][j]==0)dummyRow=0;
                
//                 else if(matrix[i][j]==0){
//                     matrix[i][0]=matrix[0][j]=0;
//                 }
//             }
//         }
//         for(int i=n-1;i>=1;i--){
//             for(int j=m-1;j>=1;j--){
//                 if(matrix[i][0]==0 || matrix[0][j]==0){
//                     matrix[i][j]=0;
//                 }
                 
//             }
           
          
//         }
//         if(dummyCol==0){
//           for(int i=0;i<n;i++){
//                  matrix[i][0]=0;
//              }  
//         }
//          if(dummyRow==0){
//              for(int j=0;j<m;j++){
//                  matrix[0][j]=0;
//              }
//          }
//     }


// BRUTE FORCE APPROACH: 
// we will traverse the entire matrix and wherever we find a 0, we will traverse it's
// row and column and make the elements -1 (except those elements whose value is 0),
// and after that just change the value of -1 to 0.
    
//     1  1  1                        1 -1  1                            1  0  1
//     1  0  1   will be changed to  -1  0 -1  which will be changed to  0  0  0
//     1  1  1                        1 -1  1                            1  0  1
    
//     time complexity: (N x M) * (N+M)
//     space complexity: O(1)
        
// OPTIMISED APPROACH 
  // we will store the values of rows and columns (i and j) in the first traversal
  // by using dummy row array and dummy col array or HashSet and again traverse the 
  // matrix. if the value of the dummy row or dummy col for that particular element
  // is 0 then change it's value to 0. But this will take extra space by storing values
 
      // time complexity: 2(N x M) 
      // space complexity: N+M
      
// BEST APPROACH     
  // make two checks for dummy col (1st col) and dummy row (1st row) and if there exists a 0   // in them then make those checks false;
  // simply follow the previous approach, only difference is that do not traverse dummy row
  // and dummy col. 
  // if check is false for dummy row, make it 0 in the end. and same for dummy col.
 
   // time complexity :  2(N x M) + O(N)+ O(M)
   // space complexity:  O(1)