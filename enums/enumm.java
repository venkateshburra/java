package enums;
enum status  //enum is a named constants
{
    Running, Failed, Pending, Success;
    
   public void show()
    {
        System.out.println("hello");
    }
}

public class enumm {

    public static void main(String args[])
    {
        status s = status.Pending;
        System.out.println(s);
        System.out.println(s.ordinal());

        status ss[] = status.values();
        System.out.println(ss[0]);

        for(status sss : ss)
        {
            System.out.println(sss + " : " + sss.ordinal());
        }

        status S = status.Pending;

        switch(S)
        {
            case Running :
                System.out.println("its Running");
                break;
            case Failed :
                System.out.println("its Failed");
                break;
            case Pending :
                System.out.println("its Pending");
                break;
            default :
                System.out.println("Success");
                break;
        }

        S.show();
      
    }
}
