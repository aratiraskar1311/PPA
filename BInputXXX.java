import java.io.*;          //bufferedreader         

class BInputXXX
{
    public static void main(String Arg[])throws IOException
    {
    
            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter first number :");
            int No1 = Integer.parseInt(bobj.readLine());            //Integer.parseInt() Static method means object create nahi kela mhanun static
            
            System.out.println("Enter second number :");
            int No2 = Integer.parseInt(bobj.readLine());

            int Ans = No1 + No2;

            System.out.println(Ans);

    }
}