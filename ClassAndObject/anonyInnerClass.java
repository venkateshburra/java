import A;

package OppsConcept;
class A
    {
        public void show()
        {
            System.out.println("in A show");
        }
    }




public class anonyInnerClass {
    //ayonymouse inner class

    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in A new show");
            }
        };

        obj.show();

    }
}
