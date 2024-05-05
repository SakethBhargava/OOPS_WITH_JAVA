import java.io.*;
class A extends Thread
{
    public void run()
    {
        System.out.println("Thread A started");
        for (int i = 1; i <= 4; i++) 
        {
            System.out.println("from thread A i=" + i);
        }
        System.out.println("exit from A");
    }
}  
class B extends Thread 
{
    public void run() 
    {
        System.out.println("Thread B started");
        for (int j = 1; j <= 4; j++) 
        {
            System.out.println("from thread B j=" + j);
        }
        System.out.println("exit from B");
    }
}
class C extends Thread 
{
    public void run() 
    {
        System.out.println("thread C started");
        for (int k = 1; k <= 4; k++) 
        {
            System.out.println("thread c =" + k);
        }
        System.out.println("exit from c");
    }
}
class ThreadPriority 
{
    static public void main(String... args) 
    {
        A a = new A();
        B b = new B();
        C c = new C();
        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(a.getPriority() + 1);
        a.setPriority(Thread.MIN_PRIORITY);
        System.out.println("start thread A");
        a.start();
        System.out.println("start thread B");
        b.start();
        System.out.println("start thread C");
        c.start();
        System.out.println("end of main thread");
    }
}