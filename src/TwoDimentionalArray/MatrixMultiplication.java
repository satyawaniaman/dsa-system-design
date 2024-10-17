package TwoDimentionalArray;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] m1={
                {1,2,3},
                {4,5,6}
        };
        int[][] m2={
                {1,1},
                {1,2},
                {2,1}
        };
        int[][] result = matrixMultiplication(m1, m2);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixMultiplication(int[][] m1, int[][] m2) {
        int row1= m1.length;
        int col1=m1[0].length;
        int row2=m2.length;
        int col2=m2[0].length;
        int[][] result=new int[row1][col2];
        if(col1==row2){
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    int sum=0;
                    for (int k = 0; k < col1; k++) {
                        int temp;
                        temp = m1[i][k] * m2[k][j];
                        sum+=temp;
                    }
                    result[i][j]=sum;
                }
            }
        }
        return result;
    }
}
