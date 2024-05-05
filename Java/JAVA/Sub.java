import java.util.Scanner;
class Sub
{
    public static void main(String args[])
    {
        String string, sub;
        int i,n=0,length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        string = scan.nextLine();
        length = string.length();
        System.out.println("Substrings of \""+string+"\" are:");
        for (int c = 0; c < length; c++)
        {
            for(i = 1; i <= length - c; i++)
            {
                sub = string.substring(c,c+i);
                System.out.println(sub);
            }
            n = n + i;
        }
        System.out.println("No of substrings present are: "+n);
    }
}