package abstractClass;
abstract class Car
{
    public abstract void drive();
    public abstract void fly();
   

    public void myMusic()
    {
        System.out.println("play Music");
    }
}

abstract class WagonR extends Car
{
    public void drive()
    {
        System.out.println("driving...");
    }
}

class updateWagonR extends WagonR  // concrete class
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}


public class abstrac {
    public static void main(String args[])
    {
        Car obj = new updateWagonR();
        obj.drive();
        obj.myMusic();
        obj.fly();
    }
}
