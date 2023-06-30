import java.util.ArrayList;
import java.util.List;

public class KnightTour {
    private static final int[] ROW_MOVES = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] COL_MOVES = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        int N = 8; // Size of the chessboard
        int[][] board = new int[N][N];

        solveKnightTour(board, 0, 0, 1);
    }

    private static void solveKnightTour(int[][] board, int row, int col, int move) {
        int N = board.length;

        board[row][col] = move;

        if (move == N * N) {
            printBoard(board);
            return;
        }


        for (int i = 0; i < 8; i++) {
            int newRow = row + ROW_MOVES[i];
            int newCol = col + COL_MOVES[i];

            if (isValidCell(newRow, newCol, N) && board[newRow][newCol] == 0) {
                solveKnightTour(board, newRow, newCol, move + 1);
            }
        }

        board[row][col] = 0;
    }

    private static boolean isValidCell(int row, int col, int N) {
        return row >= 0 && row < N && col >= 0 && col < N;
    }

    private static void printBoard(int[][] board) {
        int N = board.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}