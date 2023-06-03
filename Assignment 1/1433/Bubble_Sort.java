import java.util.Scanner;

class BubbleSort {
    public static void main(String args[])
    {
        int i,j,size,temp;
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter array size:");
        size=scn.nextInt();

        int arr[]=new int[size];
        for(i=0;i<size;i++) arr[i]=scn.nextInt();

        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(i=0;i<size;i++) System.out.print(arr[i]+" ");
    }
}
