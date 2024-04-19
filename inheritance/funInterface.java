package inheritance;
@FunctionalInterface
interface A
{
    void show();
}

// class B implements A
// {
//     public void show()
//     {
//         System.out.println("in A show");
//     }
// }
public class funInterface {
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in A show");
            }
        };
        obj.show();
    }
}
