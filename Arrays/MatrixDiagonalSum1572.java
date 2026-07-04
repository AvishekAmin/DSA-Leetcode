package Arrays;

// LeetCode 1572: Matrix Diagonal Sum
// Difficulty: Easy

// Approach:
// - Traverse the entire n × n matrix.
// - Add elements belonging to:
//   1. Primary Diagonal (i == j)
//   2. Secondary Diagonal (j == n - i - 1)
// - Use a single condition to ensure that the center element
//   of an odd-sized matrix is counted only once.
// - Return the total diagonal sum.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class MatrixDiagonalSum1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                if(i == j || j == mat.length-i-1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}