package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 0008/1000 - Pascal's Triangle
 * Difficulty: Easy
 * Pattern: 2D Array / Dynamic Programming (Basic)
 * Time Complexity: O(numRows^2)
 * Space Complexity: O(numRows^2) to store the result
 */
public class P0118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) return triangle;

        // First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            // First element of row is 1
            currentRow.add(1);

            // Fill middle elements
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of row is 1
            currentRow.add(1);

            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        P0118_PascalsTriangle solver = new P0118_PascalsTriangle();
        List<List<Integer>> result = solver.generate(5);
        
        System.out.println("8. Array - Pascal's Triangle (5 rows):");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
