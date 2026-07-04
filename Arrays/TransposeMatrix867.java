package Arrays;

// LeetCode 867: Transpose Matrix
// Difficulty: Easy

// Approach:
// - Determine the number of rows and columns in the input matrix.
// - Create a new matrix with dimensions swapped:
//   (columns × rows).
// - Traverse each element of the original matrix.
// - Place matrix[i][j] at transpose[j][i].
// - Return the transposed matrix.

// Time Complexity: O(m × n)
// Space Complexity: O(m × n)

public class TransposeMatrix867 {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int transpose[][] = new int[col][row];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
