package operators;
import java.util.Scanner;

public class assignment {
    public static void main(String args[])
    {
        //int marks = 100;
        System.out.println("Enter a number from 1 to 100");
        Scanner sc = new Scanner(System.in);
            int marks = sc.nextInt();

            if (marks == 100) {
                System.out.println("price");
            }
            else if(marks >= 90 && marks < 100 )
                System.out.println("A++");

             else if(marks >= 80 && marks < 90 )
                System.out.println("A");

             else if(marks >= 70 && marks < 80 )
                System.out.println("B");

             else if(marks >= 60 && marks < 70 )
                System.out.println("C");

             else if(marks <= 50 && marks >= 0 )
                System.out.println("D");
            
             else if(marks > 100 || marks < 0 )
                System.out.println("enter a valid number :");
        
    }
}
