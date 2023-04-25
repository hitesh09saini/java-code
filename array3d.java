import java.util.Scanner;

public class array3d {
    public static void main(String args[]){
        
        System.out.print("Enter 2D array size : ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int hight = sc.nextInt();
        
        System.out.println("Enter array elements : ");    
         
       // int twoD[][][]=new int[rows][columns][hight];
         
           
        //  for(int i=0; i<rows;i++)
        //   {            
        //      for(int j=0; j<columns;j++)
        //      {
        //         for(int k=0; k<hight;k++)
        //         {
        //             twoD[i][j][k]=sc.nextInt();
        //         }
        //      }
        //   }
        
         System.out.print("\nData you entered : \n");
         for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
               for(int k=0; k<hight;k++)
               {
                  System.out.print("*");
               }
            }System.out.println();
         }System.out.println();
        
     }  
     
}
