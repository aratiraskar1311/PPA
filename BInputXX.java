import java.io.*;             

class BInputXX
{
    public static void main(String Arg[])
    {
    
            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter first number :");
            int No1 = Integer.parseInt(bobj.readLine());            //parseInt means Wrapper class
            
            System.out.println("Enter second number :");
            int No2 = Integer.parseInt(bobj.readLine());

            int Ans = No1 + No2;

            System.out.println(Ans);

    }
}