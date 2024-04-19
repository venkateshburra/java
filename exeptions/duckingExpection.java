package exeptions;
import ClassAndObject.A;

class A
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("A");
    }
}

public class duckingExpection {

    static{
        System.out.println("class loaded");
    }
    public static void main(String args[])
    {
        A obj = new A();

        try
        {
            obj.show();
        }

        catch(ClassNotFoundException e)
        {
            System.out.println("class not found");
        }

    }
           
}
