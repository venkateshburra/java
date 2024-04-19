package ClassAndObject;
class A
{
    int age;
    public void show()
    {
        System.out.println("in A show");
    }

    class B
    {
        public void show1()
        {
            System.out.println("in B show");
        }
    }

    static class C
    {
        public void show3()
        {
            System.out.println("in C show");
        }
    }
}

public class innerClass {
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.show1();

        B.C obj3 = new B.C();
        obj3.show3();

        
    }
}
