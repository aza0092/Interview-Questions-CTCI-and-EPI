// https://www.youtube.com/watch?v=SA867FvqHrM
// linear solution since we're not using data structure, s not O(row*col)

class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0) return;
        
        int N = matrix.length;
        
		// transpose(flip diagnolly)
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
        }
        
    }
}