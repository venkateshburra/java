import tyoeCostAndCon.A;
import tyoeCostAndCon.B;

package condionalStatements;
class A
{
    public void show()
    {
        System.out.println("in  A first show");
    }
    public void show1()
    {
        System.out.println("in A new show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class objj {
    public static void main(String args[])
    {
        B obj = new B();
        obj.show1();
        obj.show();
        obj.show2();
    }
}
