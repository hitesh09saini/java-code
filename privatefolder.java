import java.util.Scanner;

public class privatefolder {
    
    public static void main(String[] args) {
        if(flag){
			int area=B*H;
			System.out.print(area);
		}

    }




   // 
private static boolean flag = GetFlag();
private static int B; 
private static int H;

private static boolean GetFlag()
{
    flag = false;
Scanner scan = new Scanner(System.in);    
    B = scan.nextInt(); 
    H = scan.nextInt();

if(B > 0 && H > 0) 
    flag = true; 
else 
    System.out.print("java.lang.Exception: Breadth and height must be positive");
scan.close();

return flag;
}
}