package TwoDimentionalArray;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] solution=  setMatrixZeroes(matrix);
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j <solution[0].length ; j++) {
                System.out.print(solution[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] setMatrixZeroes(int[][] matrix) {
        Set<Integer> rowSet = new LinkedHashSet<>();
        Set<Integer> colSet = new LinkedHashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowSet.contains(i) || colSet.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
