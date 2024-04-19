package OppsConcept;
class A
{
    public void showInOtherClass()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    @Override
    public void showinOtherClass()
    {
        System.out.println("in B show");
    }
}

public class annotaion {
    public static void main(String args[])
    {
        B obj = new B();
        obj.showInOtherClass();
    }
}
