
/*
    getClass()          //class
    hashCode()          //no address so uniqe no display
    equals()           
    clone()             
    finalize()       //same as copy constructor 
 
 */


 class Marvellous
 {

 } 

//class ObjectDemo extends Object

 class ObjectDemo
 {
    public static void main(String Arg[])
    {
        Marvellous obj = new Marvellous();      
        System.out.println(obj.getClass().getName());
    }
 }