import enums.Loptop;

package condionalStatements;
class Loptop
{
    String model;
    int price;

    public String toString()
    {
        return model + " : " + price;
    }
}

public class objectToString {
    public static void main(String args[])
    {
        Loptop obj = new Loptop();
        obj.model = "Lenavo yoga";
        obj.price = 1000;

        System.out.println(obj.toString());
    }
}
