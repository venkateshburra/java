package loops;
public class forLoop {
    
    public static void main(String a[]) {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("DAY " + i);

            for(int j = 1; j <= 9; j++)
            {
                System.out.println(" " + (j+8) + " - " + (j+9));
            }
        }
    }
}
