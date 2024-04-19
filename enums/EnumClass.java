package enums;
import intertface.Loptop;

enum Loptop
{
    Macbook(1000), XPS(2000), Surface, Lenavo(4000);

    private int price;

    private Loptop()
    {
        price = 500;
    }

    private Loptop(int price)
    {
        this.price = price;
        System.out.println("in laptop" + " : " + this.name());
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
}

public class EnumClass {
    public static void main(String args[])
    {
        Loptop lap[] = Loptop.values();
        //System.out.println(lap + " : " + lap.getPrice());

        for(Loptop lapp : lap)
        {
            System.out.println(lapp + " : " + lapp.getPrice());
        }

        System.out.println("another one");

        for(Loptop laptop : Loptop.values())
        {
            System.out.println(laptop + " : " + laptop.getPrice());

        }
    }
}
