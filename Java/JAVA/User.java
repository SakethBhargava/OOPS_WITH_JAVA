import java.io.*;
class MyException extends Exception
{
    String str1;
    MyException(String str2)
    {
        str1=str2;
    }
    public String tostring()
    {
        return("Output :"+str1);
    }
}
class User
{
    static public void main(String... args)
    {
        try
        {
            throw new MyException("custom");
        }
        catch(MyException exp)
        {
            System.out.println("This is catch block");
            System.out.println("Out of exp");
        }
    }
}