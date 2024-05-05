import java.util.*;
public class evenodd
{
    public static void main(String args[])
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        n = scan.nextInt();
        switch (n % 2)
        {
            case 0:
                System.out.println("This number is even");
                break;
            case 1:
                System.out.println("This number is odd");
                break;
        }
    }
}
