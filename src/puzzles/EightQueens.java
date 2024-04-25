package puzzles;

public class EightQueens {
    private int [][] board;
    private int counter;

    public EightQueens() {
        board = new int[8][8];
        counter = 0;
    }

    public boolean isAttacked(int row, int col) {
        int colLeft = col - row;
        int colRight = col + row;
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 1) {
                return true;
            }
            if(colLeft >= 0 && board[i][colLeft] == 1) {
                return true;
            }
            if(colRight <= 7 && board[i][colRight] == 1) {
                return true;
            }
            colLeft++;
            colRight--;
        }
        return false;
    }

    public void findSolution(int row) {
        if(row == 8) {
            counter++;
            printBoard();
        }
        else {
            for(int col = 0; col < 8; col++) {
                if(!isAttacked(row, col)) {
                    board[row][col] = 1;
                    findSolution(row + 1);
                    board[row][col] = 0;
                }
            }
        }
    }

    public void printBoard() {
        System.out.println("Solution: " + counter);
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EightQueens queens = new EightQueens();
        queens.findSolution(0);
    }
}
