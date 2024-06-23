
class Base 
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }
    public void Fun()
    {
        System.out.println("Inside Base fun");
    }
}
class Derived extends Base        //class Derived : public Base
{
    public int X,Y;
     public Derived()
    {
        System.out.println("Derived constructor");
    }
    public void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
}
class DerivedX extends Derived
{
    public int P,Q;
    public DerivedX()
    {
        System.out.println("DerivedX constructor");
    }
    public void Sun()
    {
        System.out.println("Inside DerivedX Sun");
    }
}


class Multilevel
{
    public static void main(String A[])
    {
        DerivedX dobj1 = new DerivedX();

      dobj1.Fun();
      dobj1.Gun();
      dobj1.Sun();
    }
}