

class Base 
{
    public int A,B;
    public void Fun()
    {
        System.out.println("Inside Base fun");
    }
    public void Gun()
    {
        System.out.println("Inside Base gun");
    }
    public void Sun()
    {
        System.out.println("Inside Base sun");
    }
    public void Run()
    {
        System.out.println("Inside Base run");
    }
}
class Derived extends Base        //class Derived : public Base
{
    public int X,Y;
    public void Gun()
    {
        System.out.println("Inside Derived Gun");
    } 
    public void Run()
    {
        System.out.println("Inside Base run");
    }
    public void Mun()
    {
        System.out.println("Inside Base mun");
    }

}

class RMD
{
    public static void main(String A[])
    {
       Base bobj = new Derived();         //upcastiing

       //Derived bobj = new Derived();

       bobj.Fun();      //base
       bobj.Gun();      //derived
       bobj.Sun();      //base
       bobj.Run();      //derived
       bobj.Mun();      //error
    }
}


