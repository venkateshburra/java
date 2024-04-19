package exeptions;
public class throwKey {
    public static void main(String args[])  //thrw keyword is used to throw expection
    {
        int i = 30;
        int j = 0;

        try
        {
            j = 20/i;
            if(j == 0)
                throw new ArithmeticException("i dont want to print Zero");
        }

        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("thats default value");
        }

        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("bye");
    }
}
