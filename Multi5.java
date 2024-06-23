
class Demo extends Thread               //multithreading way1 using inheritance
{
    public void run()                   //call back method
    {
        try
        {

        int i = 0;
        String name = Thread.currentThread().getName();
        for(i = 0; i <= 10; i++)
        {
            System.out.println("Running thread :"+name+"with value :"+i);
            Thread.sleep(1000);
        }
    }
    catch(Exception obj)
    {}
    }
}


class Multi5
{
    public static void main(String A[])
    {
        System.out.println("current thread is :"+Thread.currentThread().getName());
        Demo obj1 = new Demo();

        obj1.setName("PPA");
       
        obj1.start();               //start() call kelyawar thread shcheduled
       
        System.out.println("End of main thread");
    }

}