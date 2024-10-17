package TwoDimentionalArray;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] solution = rotateImage(matrix);
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[0].length; j++) {
                System.out.print(solution[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] rotateImage(int[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            int i = 0;
            int j = matrix.length-1;
            while(i<=j){
                int temp = matrix[i][col];
                matrix[i][col] = matrix[j][col];
                matrix[j][col] = temp;
                i++;
                j--;
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        return matrix;
    }
}