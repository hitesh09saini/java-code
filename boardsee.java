
 class boardsee {
   
    
   public static void boardprint() {
        
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

}
