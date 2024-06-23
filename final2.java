class Base
{
    public void fun()
    {
        System.out.println("Inside Base fun");
    }
    public final void gun()
    {
        System.out.println("Inside Base gun");
    }
}

class Derived extends Base
{
    public void fun()               //method override
    {
        System.out.println("Inside Derived fun");
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
}
class final2
{
    public static void main(String A[])
    {
            
        
    }
}
