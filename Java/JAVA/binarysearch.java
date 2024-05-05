import java.util.Scanner;
public class binarysearch
{
    static public void main(String... args)
    {
        int i,mid,first,last,x,n,flag=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        n = scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of array :");
        for(i=0;i<n;++i)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Enter element to search:");
        x = scan.nextInt();
        first=0;
        last=n-1;
        while(first<=last)
        {
            mid=(first+last)/2;
            if(a[mid]>x)
            {
                last=mid-1;
            }
            else if(a[mid]<x)
            {
                first=mid+1;
            }
            else
            {
                flag=1;
                System.out.println("element found");
                break;
            }
        }
        if(flag==0)
        System.out.println("element not found");
    }
}