import java.io.*;
import java.util.*;
import java.lang.*;
public class Filewriter
{
    static public void main(String... args)
    {
       try
       {
        Filewriter fw = new Filewriter("sample.txt");
        for(char i=65;i<=91;i++)
        {
            fw.write(i);
        }
        fw.close();
       }
       catch(Exception e)
       {
        System.out.println("Exception :"+e);
       }
    }
}
