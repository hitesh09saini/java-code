import java.util.Scanner;

public class sudoku {

    public static boolean safe(char[][]board ,int row ,int col ,int num) {
        //safe for row and column
       for(int i=0;i<board.length;i++ ){

        if(board[i][col]==(char)(num+'0')){
         return false;
        }
        if(board[row][i]==(char)(num+'0')){
            return false;
           }

       }

       // for grid

       int sr = (row/3)*3;
       int sc = (col/3)*3;

       for(int i=0;i<sr+3;i++){
        for(int j =0;j<sc+3;i++){
            if(board[i][j]==(char)(num+'0')){

            return false;
            }

        }
       }
       return true;

    }


    public static boolean helper(char[][]board,int row ,int col) {
        if(row==board.length){

            return true;
        }

        int rown =0;
        int coln =0;
        if(col !=board.length-1){
             rown = row;
             coln = col+1;
        }else{
            rown = row+1;
            coln = 0; 
        }
        if(board[row][col]!='.'){
         if(helper(board, rown, coln)){
            return true;
         }

        }else{

            for(int i =0;i<=9;i++){
               if(safe(board, row, col, i)){
                 board[row][col]=(char)(i+'0');
                 if(helper(board, rown, coln)){
                    return true;
                 }else{
                   board[row][col]='.';

                 }
                
               }

            }

        }




        return false;



    }

    public static void sudokuout(char[][] board) {

        helper(board, 0, 0);
         

    }

  
}
