import java.util.*;

public class AlphaOrder
{
    public static void main(String args[])
    {
        int n;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total number of string to be entered: ");
        n = scan.nextInt();
        String str[] = new String[n];
        System.out.println("Enter the string one by one:");
        Scanner scan2 = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            str[i] = scan2.nextLine();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (str[i].compareTo(str[j]) > 0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Strings in sorted order:");
        for (int i = 0; i <= n - 1; i++)
        {
            System.out.println(str[i]);
        }
    }
}