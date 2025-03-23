package challenges.unitSix;

import java.util.Scanner;

public class TicTacToe {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("\nLet's play tic tac toe");

        char[][] board = {
                {'_','_','_'},
                {'_','_','_'},
                {'_','_','_'}
        };


        printBoard(board);

        for (int i=0; i<9; i++){
            if (i%2 == 0) {
                System.out.println("Turn: X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
            }
            else {
                System.out.println("Turn: O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }
            printBoard(board);


            if(checkWin(board) == 3){
                System.out.println("X wins!");
                break;
            }else if (checkWin(board) == -3){
                System.out.println("O wins!");
                break;
            }

        }

        scan.close();
    }


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     *
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines.
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */
    public static void printBoard(char[][] board){
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[i].length; j++){
                System.out.print("\t" + board[i][j] + " ");
            }
            System.out.println();
        }
    }
    /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return (int[])
     *
     * Inside the function
     *   1. Asks the user: - pick a row and column number:
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     *
     */
    public static int[] askUser(char[][] board){

            System.out.print("Pick a row and column number: ");
            int row = scan.nextInt();
            int col = scan.nextInt();

            while(board[row][col] == 'X' || board[row][col] == 'O'){
                System.out.print("Spot taken, try again: ");
                row = scan.nextInt();
                col = scan.nextInt();
            }

        return new int[]{row, col};
    }
    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin
     * @param board (char[][])
     * @return count (int)
     *
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
    public static int checkWin(char[][] board){
        int count = 0;

        int rows = checkRows(board);
        if(Math.abs(rows)==3)
            return rows;

        int cols = checkColumns(board);
        if(Math.abs(cols)==3)
            return cols;

        int leftDiagonal = checkLeft(board);
        if(Math.abs(leftDiagonal)==3)
            return leftDiagonal;

        int rightDiagonal = checkRight(board);
        if(Math.abs(rightDiagonal)==3)
            return rightDiagonal;

        return count;
    }
    public static int checkRows(char[][] board){
        int count = 0;

        for (int row=0; row< board.length; row++){
            for(int col=0; col<board[row].length; col++){
                if(board[row][col] == 'X'){
                    count++;
                    if(count == 3)
                        return count;
                } else if (board[row][col] == 'O') {
                    count--;
                    if (count == -3)
                        return count;
                }
            }
            count = 0;
        }
        return count;
    }
    public static int checkColumns(char[][] board){
        int count = 0;
        
        for (int col=0; col<board.length; col++){
            for(int row=0; row<board[col].length; row++){
                if(board[row][col] == 'X'){
                    count++;
                    if(count == 3)
                        return count;
                } else if (board[row][col] == 'O') {
                    count--;
                    if(count == -3)
                        return count;
                }
            }
            count = 0;
        }
        
        return count;
    }
    public static int checkLeft(char[][] board){
        int count = 0;
        int col = 0;

        for(int row=2; row>=0; row--){
            if(board[row][col] == 'X'){
                count++;
                if(count == 3)
                    return count;
            } else if (board[row][col] == 'O') {
                count--;
                if(count == -3)
                    return count;
            }
            col++;
        }
        return count;
    }
    public static int checkRight(char[][] board){
        int count = 0;
        int col = 0;

        for (int row=0; row< board.length; row++){
            if(board[row][col] == 'X'){
                count++;
                if( count == 3){
                    return count;
                }
            } else if (board[row][col] == 'O') {
                count--;
                if( count == -3){
                    return count;
                }
            }
            col++;
        }
        return count;
    }
}
