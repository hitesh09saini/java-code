import java.util.Scanner;

public class cc1 {
   

	public static void main (String[] args) 
	{
		// your code goes here
	Scanner s = new Scanner(System.in);
	
    int []a = new int[4];
	
	for(int i =0;i<4;i++){
	    a[i] = s.nextInt();
	}
    int c =0;
	for(int i =0 ;i<4;i++){

        if(a[i]>=10){
        c++;
        }
    }
    System.out.println(c);
	}
}

