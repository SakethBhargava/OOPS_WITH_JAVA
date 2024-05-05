import java.io.*;
import java.util.*;
class Predefined
{
    public static void main(String args[])
    {
        int num1,num2;
        try
        {
            num1 = 0;
            num2 = 62 / num1;
            System.out.println("try block msg");
        } 
        catch (ArithmeticException e)
        {
            System.out.println("error divided by zero");
        }
        System.out.println("out of catch block");
    }
}
