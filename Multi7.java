
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
            
        }
    }
    catch(Exception obj)
    {}
    }
}


class Multi7
{
    public static void main(String A[])
    {
        System.out.println("current thread is :"+Thread.currentThread().getName());
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.setName("PPA");
        obj2.setName("LB");

        System.out.println("priority of obj1 :"+obj1.getPriority());
        System.out.println("priority of obj2 :"+obj2.getPriority());

        obj1.setPriority(10);
        obj2.setPriority(10);

        System.out.println("priority of obj1 :"+obj1.getPriority());
        System.out.println("priority of obj2 :"+obj2.getPriority());

        obj1.start();               //start() call kelyawar thread shcheduled
        obj2.start();
    }

}