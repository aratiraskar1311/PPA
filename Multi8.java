
class Marvellous
{
    public void Display(int no)
    {
        try
        {
            int i = 0;
            for(i = 1; i <= 10; i++)
            {
                 System.out.println(i*no);
                 Thread.sleep(1000);        //pause gheto
            }
        }
        catch(Exception obj)
        {}

        }
}
class Demo extends Thread           //thread1 : multiple thred multiple task - 1
{
    public void run()
    {
        Marvellous mobj = new Marvellous();
        mobj.Display(5);
    }
}

class Hello extends Thread          //thread2 : multiple thred multiple task - 2
{
    public void run()
    {
        Marvellous mobj = new Marvellous();
        mobj.Display(2);
    }
}




class Multi8
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        Hello hobj = new Hello();

        dobj.start();           //Runnable state start
        hobj.start();           //Runnable state start

    }
}