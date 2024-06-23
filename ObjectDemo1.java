class Marvellous
 {
    public int i,j;

    public Marvellous()
    {
        System.out.println("Marvellous Constructor");
    }
    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
 }

//class ObjectDemo extends Object

 class ObjectDemo1
 {
    public static void main(String Arg[])
    {
        Marvellous obj = new Marvellous();      
        obj = null;
        System.gc();            //garbage collector
    }
 }