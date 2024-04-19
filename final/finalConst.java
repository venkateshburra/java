import polymorphism.Calc;

final class Calc //  with final keyword we cannot inherits classes
{
    public final void show() // it stops method overriding
    {
        System.out.println("by mahesh");
    }

    public void  add(int a, int b)
    {
        System.out.println(a + b);
    }
}

class AdvanCal extends Calc
{
    public void show()
    {
        System.out.println("by venky");
    }
}

public class finalConst {
    public static void main(String args[])
    {
        final int num = 20;

        //num = 30; we cannot change the variable 

        System.out.println(num);

        AdvanCal obj = new AdvanCal();

        obj.show();
        obj.add(10, 10);

    }
}
