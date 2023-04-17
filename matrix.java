 import java.util.*;
 public class matrix {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
    
    
// give matrix size 
System.out.println("give the number of row :");
int row = sc.nextInt();


System.out.println("give the number of columan");
int columan = sc.nextInt();


int mark[][]= new int[row][columan];


// number input 
System.out.print("enter the number according  to size . ");
System.out.println("input number are feed as a11 ,a12 ,a13......etc.");
for(int i=0;i<row;i++){
    for(int j=0;j<columan;j++){
mark[i][j]=sc.nextInt();
    }
}


// matrix :
       System.out.println(" output >>");
        for(int i =0;i<row ;i++){
for(int j=0;j<columan;j++){

System.out.print(mark[i][j]+" ");
}
System.out.println();
        }
System.out.println(" this matrix is "+row+"*"+columan+"matrix");

// cycle form matrix 
System.out.println(" cycle");
int rowst = 0;
int rowen = row-1;
System.out.println(rowen);
int cols = 0;
int cole = columan-1;
System.out.println(cole);


for(int a = rowst; a <rowen ; a++){
    System.out.print(mark[cols][a]+" ");   
}

for(int b = cols; b <=cole ; b++){
    System.out.print(mark[b][rowen]+" ");
}
for(int a = rowen-1; a>=rowst ; a--){
    System.out.print(mark[cole][a]+" ");   
}
for(int a = rowst; a <rowen ; a++){
    System.out.print(mark[1][a]+" ");   
}




// find variable 
System.out.println("enter the number");
int a = sc.nextInt();
int m = 0,n = 0;
for(int i=0;i<mark.length;i++){
    for(int j=0;j<mark.length;j++){

if(mark[i][j]==a){
    m = i;
    n = j;
}
}
}
if(a == mark[m][n]) {
    System.out.println("Element found at : mark"+"["+m+"]"+"["+n+"]");
}else {
    System.out.println("Element not found.");
}
}
}
