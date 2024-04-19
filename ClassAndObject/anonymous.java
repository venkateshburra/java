package OppsConcept;
class A
{
    public A()
    {
        System.out.println("object is created");
    }

    public void show()
    {
        System.out.println("in a Show");
    }
}


public class anonymous {
    public static void main(String args[])
    {
        new A().show();  //ananymous object
    }
}
