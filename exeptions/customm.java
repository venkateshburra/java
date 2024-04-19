package exeptions;
class VenkyExpection extends Exception
{
    public VenkyExpection(String string)
    {
        super(string);
    }
}


public class customm {
    public static void main(String args[])
    {
        int i = 30;
        int j = 0;

        try
        {
            j = 20/i;
            if(j == 0)
                throw new VenkyExpection("i dont want to print Zero");
        }

        catch(VenkyExpection e)
        {
            j = 18/1;
            System.out.println("thats default value " + e);
        }

        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("bye");
    }
}