public class marged {
    /**
     * @param arr
     * @param si
     * @param end
     * @param mid
     */
    public static void conquer(int arr[],int si ,int mid ,int end) {
        int marge[] =  new int [end-si+1];
        
        int inx1=si;
        int inx2=mid+1;
        int x= 0;
        
        while(inx1<=mid&&inx2<=end){
           if(arr[inx1]<=arr[inx2]){
            marge[x++]= arr[inx1++];
           }else{
            marge[x++]=arr[inx2++];
           }
        }
        while(inx1<=mid){
            marge[x++]= arr[inx1++];
        }
        while(inx2<=end){
            marge[x++]=arr[inx2++];
        }
       //print 
        for(int i=0,j=si;i < marge.length;i++,j++){
          arr[j] = marge[i];


        }
    }

    public static void divide(int[] arr,int si,int end ) {
        // base point

        if(si>=end){
            return;
        }
        
        int mid = si+(end-si)/2;
        // first array
        divide(arr, si, mid);
        //  second array
        divide(arr, mid+1, end);
        // conquer
        conquer(arr, si, mid, end);
       

    }
    

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int  n = arr.length;


    divide(arr, 0, n-1);

     for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
     }
        
    }
}
