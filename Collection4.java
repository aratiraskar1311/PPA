//Hashtable

import java.util.*;
r
class Collection4
{
    public static void main(String Arg[])
    {
        Hashtable <String, Integer> hobj = new Hashtable<String, Integer>();

        hobj.put("PPA",19500);
        hobj.put("LB",20000);
        hobj.put("PYTHON",20500);
        hobj.put("Angular",21000);

        System.out.println(hobj.get("PYTHON"));

    }
}