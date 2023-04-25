public class quicksorting {
    public static int solv(int a[],int low ,int high){

        int p =a[ high];
        int i =low-1;
        for(int j =low;j<high;j++){
         if(a[j]<p){
            i++;
            //swap
            int t = a[i];
            a[i]= a[j];
            a[j]=t;

         }
        }
        i++;
        int t = a[i];
        a[i] = p;
        a[high] = t;

    return i;
    }
    public static void pivot(int a[],int low,int high) {
         
        if(low<high){
            int p = solv(a,low,high);
        
            pivot(a, low, p-1);
            pivot(a, p+1, high);

        }
        
    }
    public static void main(String[] args) {
        int a[]={4,7,2,9,6};
        int n = a.length;
       pivot(a, 0, n-1);
      for(int i =0;i<n;i++){
       System.out.print(a[i]+" ");

      }
    }
}
