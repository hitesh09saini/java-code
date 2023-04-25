import java.util.Scanner;

public class chatic{
    private char[][] board;
    private char currentPlayer;
    
    public chatic() {
        board = new char[3][3];
        currentPlayer = 'X';
        initBoard();
    }
    
    private void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    
    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    
    public void play() {
        boolean gameEnd = false;
        int row, col;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tic Tac Toe!");
        System.out.println("Player 1 is X, Player 2 is O");
        System.out.println("To make a move, enter the row and column of the board (0-2).");
        
        while (!gameEnd) {
            System.out.println("Current board:");
            printBoard();
            System.out.println(currentPlayer + "'s turn.");
            
            System.out.print("Enter row: ");
            row = scanner.nextInt();
            System.out.print("Enter column: ");
            col = scanner.nextInt();
            
            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                if (isWin()) {
                    System.out.println("Congratulations " + currentPlayer + "! You win!");
                    gameEnd = true;
                } else if (isDraw()) {
                    System.out.println("Game over. It's a draw.");
                    gameEnd = true;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }
        
        scanner.close();
        System.out.println("Final board:");
        printBoard();
    }
    
    private void switchPlayer() {
    }

    private boolean isDraw() {
        return false;
    }

    private boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != '-') {
            return false;
        }
        return true;
    }
    
    private boolean isWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return true;
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return true;
            }
        }
        
        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0]==board[2][2]){
            return true;
        }
        return false;
       }


}
