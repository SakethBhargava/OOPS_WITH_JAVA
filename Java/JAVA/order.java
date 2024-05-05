import java.util.*;
public class order
{
    static public void main(String... args)
    {
        int n;
        String temp;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter no of Strings :");
        n=scan.nextInt();
        String str[] = new String[n];
        System.out.println("Enter the strings one by one :");
        Scanner scan2 = new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            str[i]=scan2.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("Sorterd Order :");
        for(int i = 0;i < n - 1;i ++);
        {
            System.out.println(str[i]);
        }
        System.out.println(str[n-1]);
    }
}