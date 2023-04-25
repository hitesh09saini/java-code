import java.util.Scanner;

public class tictactoc1{

    public static void board() {
        String s ="  ";

        String board[][]=new String[3][3];
         for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
             
             board[j][i]=s;
           }
         }
 
         //print board
 
             System.out.println("----------------");
         for(int i=0;i<3;i++){
             System.out.print("| ");
             for(int j=0;j<3;j++){
               System.out.print(board[j][i]+" | ");
             }
             System.out.println();
             System.out.println("----------------");
           }

    }
    public static void play() {
        

    }

    public static boolean winx(String x,String board[][]) {
        //for rows
        if(board[0][0]==board[0][1]&&board[0][1]==board[0][2]){
          return true;
        }else if(board[1][0]==board[1][1]&&board[1][1]==board[1][2]){
          return true;
        }else if(board[2][0]==board[2][1]&&board[2][1]==board[2][2]){
           return true;
        }
          
        //colume
          if(board[0][0]==board[1][0]&&board[1][0]==board[2][0]){
            return true;
          }else if(board[0][1]==board[1][1]&&board[1][1]==board[2][1]){
             return true;
          }else if(board[0][2]==board[1][2]&&board[1][2]==board[2][2]){
             return true;
          }

          // 

          if(board[0][0]==board[1][1]&&board[1][1]==board[2][2]){
            return true;
          }else if(board[0][2]==board[1][1]&&board[1][1]==board[2][0]){
             return true;
          }
        return false;
    
    }


    public static boolean winy(String y,String board[][]) {
        //for rows
        if(board[0][0]==board[0][1]&&board[0][1]==board[0][2]){
          return true;
        }else if(board[1][0]==board[1][1]&&board[1][1]==board[1][2]){
          return true;
        }else if(board[2][0]==board[2][1]&&board[2][1]==board[2][2]){
           return true;
        }
          
        //colume
          if(board[0][0]==board[1][0]&&board[1][0]==board[2][0]){
            return true;
          }else if(board[0][1]==board[1][1]&&board[1][1]==board[2][1]){
             return true;
          }else if(board[0][2]==board[1][2]&&board[1][2]==board[2][2]){
             return true;
          }

          // 

          if(board[0][0]==board[1][1]&&board[1][1]==board[2][2]){
            return true;
          }else if(board[0][2]==board[1][1]&&board[1][1]==board[2][0]){
             return true;
          }
        return false;
    
    }
    public static void main(String[] args) {
        // board print 
       board();
       Scanner S = new Scanner(System.in);
       System.out.println("enter the first player name :- ");
       String x= S.nextLine();
       System.out.println();
       System.out.println("enter the second player name :- ");
       String y= S.nextLine();
       System.out.println();
       System.out.println(x+"= O " );
       System.out.println(y+"= # " );
       System.out.println();
       System.out.println(" let's play...");


       winx(x, null);
       winy(y, null);
       

    }
}
