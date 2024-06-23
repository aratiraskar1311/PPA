
import java.util.*;

class AgeInvalid extends Exception
{

}

class User
{
    public static void main(String Arg[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("please enter your age :");
            int Age = sobj.nextInt();

            if(Age < 18)
            {
                throw new AgeInvalid();
            }
            else
            {
                System.out.println("Your successfully log in on site");
            }

        }
        catch(AgeInvalid obj)
        {
            System.out.println("Age is invalid to register for this site");
        }
    }

}

