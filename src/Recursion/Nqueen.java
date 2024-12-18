package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Nqueen {
    static List<String> construct(char[][] board){
        List<String> res=new ArrayList<>();
        for(int i=0;i< board.length;i++){
            res.add(new String(board[i]));
        }
        return res;
    }
   public static List<List<String>> nQueen(int n){
       char[][] board=new char[n][n];
       for (int i=0;i<n;i++){
           for (int j=0;j<n;j++){
               board[i][j]='.';
           }
       }
       List<List<String>> res=new ArrayList<List<String>>();
       helper(0, board, res, n);
       return res;
       
   }

    private static void helper(int col, char[][] board, List<List<String>> res, int n) {
       if(col==n){
           res.add(construct(board));
       }
       for(int row=0;row<n;row++){
           if(isValid(row,col,board,n)){
               board[row][col]='Q';
               helper(col + 1, board, res, n);
               board[row][col] = '.';
           }
       }
    }

    private static boolean isValid(int row, int col, char[][] board, int n) {
        for (int c = 0; c < col; c++) {
            if (board[row][c] == 'Q') {
                return false;
            }
        }

        // Check left upper diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check left lower diagonal
        for (int r = row, c = col; r <n && c >=0 ; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
