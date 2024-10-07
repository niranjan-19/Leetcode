class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;
//transpose the matrix
//swap the elements along diagonal
        for(int i =0 ; i < n ; i++){
            for(int j  = i+1 ; j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] =matrix[j][i]; 
                matrix[j][i] = temp;
            }
        }
        //reverse each row 
        for(int i =0 ; i < n ;i++){
            for(int j =0 ;j < n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] =matrix[i][n-1-j]; // imp j formula 
                matrix[i][n-1-j] = temp ;
            }
        }

    }
}