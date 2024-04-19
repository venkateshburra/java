package inheritance;
import other.F;
public class inherit {
    public static void main(String args[])
    {
        veryAdvCalc obj = new veryAdvCalc();

        int r1 = obj.add(4,5);
        int r2 = obj.sub(7,2);
        int r3 = obj.mult(5, 4);
        int r4 = obj.div(20, 4);
        int r5 = obj.power(4,2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

        D obj1 = new D();
        F obj2 = new F();

        System.out.println(obj1.marks);
        System.out.println(obj2.marks);

    }
}
