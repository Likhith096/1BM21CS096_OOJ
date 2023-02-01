class thread1 extends Thread
{
    public void run()
    {
        try{//Sleep throws exception
        for(int i=1;i<=3;i++)
        {
        System.out.println("BMS College of Engineering");
        Thread.sleep(10000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println("Interrupted error "+e);
    }
    }
}
class thread2 extends Thread
{
    public void run()
    {
        try{
        for(int i=1;i<=5;i++)
        {
        System.out.println("CSE");
        Thread.sleep(2000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println("Interrupted error "+e);
    }
    }
}
class multithreading
{
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }
}