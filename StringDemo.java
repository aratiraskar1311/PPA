
class StringDemo
{
    public static void main(String Arg[])
    {
        String s1 = "Hello";                        //to create string in java way 1

        String s2 = new String("Hello");    //to create string in java way 2

        char Arr[] = {'h','e','l','l','o'};            //to create string in java way 2
        String s3 = new String(Arr);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());

    

    }
}