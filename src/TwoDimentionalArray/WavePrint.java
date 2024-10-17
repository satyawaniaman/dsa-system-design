package TwoDimentionalArray;

public class WavePrint {
    static void printInWave(int[][] arr){
        for (int col = 0; col < arr[0].length; col++) {
            if(col%2==0){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][col]+" ");
                }
            }else{
                for (int i = arr.length-1; i >=0 ; i--) {
                    System.out.print(arr[i][col]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        printInWave(arr);
    }
}
