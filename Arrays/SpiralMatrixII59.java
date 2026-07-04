package Arrays;

// LeetCode 59: Spiral Matrix II
// Difficulty: Medium

// Approach:
// - Create an n × n matrix.
// - Maintain four boundaries:
//   startRow, endRow, startCol, endCol.
// - Fill numbers from 1 to n² while traversing:
//   1. Left to Right
//   2. Top to Bottom
//   3. Right to Left
//   4. Bottom to Top
// - After completing each layer, shrink the boundaries inward.
// - Continue until all cells are filled.

// Time Complexity: O(n²)
// Space Complexity: O(n²)

public class SpiralMatrixII59 {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;

        int num = 1;

        while(startRow <= endRow && startCol <= endCol) {

            // Top
            for(int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = num++;
            }

            // Right
            for(int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = num++;
            }

            // Bottom
            for(int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                matrix[endRow][j] = num++;
            }

            // Left
            for(int i = endRow - 1; i >= startRow + 1; i--) {
                if(startCol == endCol) {
                    break;
                }
                matrix[i][startCol] = num++;
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return matrix;
    }
}