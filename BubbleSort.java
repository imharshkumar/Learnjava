package Trial;

public class BubbleSort {
    public static void main (String [] arg){
        int a[]={5,4,3,1,8,-4,7,2};
        int n=a.length;

        for(int i=1;i<n;i++)
        {
            boolean sorted=true;
            for(int j=0;j<n-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                    sorted=false;
                }
            }
            if(sorted)
                break;
        }
        System.out.println("sorted array= ");
        for(int z=0;z<n;z++)
        {
            System.out.print(a[z]+" ");
        }
        System.out.println();
        for(int s:a)//for each loop for print whole array
        {
            System.out.print(s+" ");
        }
    }

}
