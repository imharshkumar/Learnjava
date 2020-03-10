package Trial;

public class SelectionSort
{
    public static void main(String [] arg)
    {
     int ar[]={4,3,9,2,-2,5,-9};
     int n=ar.length;
     int v,s=0;
     for(int j=0;j<n-1;j++) {
         v=Integer.MAX_VALUE;
         for (int i = j; i < n; i++) {
             if (v > ar[i]) {
                 v = ar[i];
                 s=i;
             }
         }
         ar[s]=ar[j];
         ar[j]=v;
     }
     for(int st:ar)
     {
         System.out.print(st);
     }

    }
}
