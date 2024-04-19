package exeptions;
public class expectionn {
    public static void main(String args[])
    {
        int i = 10;
        int j = 0;
        String str = null;

        int nums[] = new int[5];

       try 
        {
            j = 20/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }

        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero"); 
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay in your limit");
        }

        catch(Exception e)
        {
            System.out.println("something went wrong");
        }

        System.out.println(j);

        System.out.println("bye");

    }
}
