package ArrayList;

// LeetCode 54: Spiral Matrix
// Difficulty: Medium

// Approach:
// - Maintain four boundaries:
//   startRow, endRow, startCol, endCol.
// - Traverse the matrix layer by layer:
//   1. Left to Right
//   2. Top to Bottom
//   3. Right to Left
//   4. Bottom to Top
// - After completing a layer, shrink the boundaries inward.
// - Continue until all elements are visited.

// Time Complexity: O(m × n)
// Space Complexity: O(1) excluding output list

import java.util.*;

public class SpiralMatrix54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {

            // Top
            for(int j = startCol; j <= endCol; j++) {
                ans.add(matrix[startRow][j]);
            }

            // Right
            for(int i = startRow + 1; i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
            }

            // Bottom
            for(int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                ans.add(matrix[endRow][j]);
            }

            // Left
            for(int i = endRow - 1; i >= startRow + 1; i--) {
                if(startCol == endCol) {
                    break;
                }
                ans.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return ans;
    }
}