package condionalStatements;
class Computer
{
    public void playMusic()
    {
        System.out.println("music playing...");
    }

    public String getMePen(int cost)
    {
        if(cost >= 10)
             return "Pen";
        else
            return "nothing get pen";
    }
}


public class object {
    
    public static void main(String args[]) {

        Computer obj = new Computer();

        obj.playMusic();
        String str = obj.getMePen(10);
        System.out.println(str);
    }
}
