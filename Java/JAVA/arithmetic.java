import java.util.Scanner;
public class arithmetic
{
    static public void main(String... args)
    {   
        while(true)
        {
            int a,b,c,sum,sub,mul,div,mod;
            System.out.println("");
            System.out.println("*****Enter Two Numbers To Perform Arithmetic Operations*****");
            System.out.print("Enter 1st Number : ");
            Scanner one = new Scanner(System.in);
            a = one.nextInt();
            System.out.print("Enter 2nd Number : ");
            b = one.nextInt();
            System.out.println("1.Summation \n2.Difference \n3.Product \n4.Division \n5.Modulus");
            System.out.println("Enter Your Choice : ");
            c = one.nextInt();
            switch(c)
            {
                case 1:
                {
                    sum = a+b;
                    System.out.println("Summation is : "+sum);
                    break;
                }
                case 2:
                {
                    sub = a-b;
                    System.out.println("Difference is : "+sub);
                    break;
                }
                case 3:
                {
                    mul = a*b;
                    System.out.println("Product is : "+mul);
                    break;
                }
                case 4:
                {
                    div = a/b;
                    System.out.println("Division is : "+div);
                    break;
                }
                case 5:
                {
                    mod = a%b;
                    System.out.println("Modulus is : "+mod);
                }
                default:
                {
                    System.out.println("Invalid Number");
                }
                while(c!=5);
            }
        }
    }
}