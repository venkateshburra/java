import OppsConcept.A;

package abstractClass;
abstract class A
{
    public abstract void show();
    protected abstract void show1();//The abstract method show1 in type A can only set a visibility modifier, one of public or protectedJava(67109226)
}

public class abAndAnoIC {
    //abstract and anynimouse inner class
    public static void main(String args[])
    {
        A obj = new A() {
            public void show()
            {
                System.out.println("in A new show");
            }
              public void show1()
            {
                System.out.println("in A new show1");
            }
        };

        obj.show();
        obj.show1();
    }
}
