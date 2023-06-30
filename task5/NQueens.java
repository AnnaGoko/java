import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int N = 8; // Size of the chessboard
        int[][] board = new int[N][N];

        solveNQueens(board, 0);
    }

    private static void solveNQueens(int[][] board, int col) {
        int N = board.length;

        if (col >= N) {
            printBoard(board);
            return;
        }

        for (int row = 0; row < N; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                solveNQueens(board, col + 1);
                board[row][col] = 0;
            }
        }
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        int N = board.length;

        // Check if there is a queen in the same row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check if there is a queen in the upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check if there is a queen in the lower diagonal
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        int N = board.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}