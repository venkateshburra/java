package OppsConcept;


public class ClassAndObject {
    
     public static int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
    public static void main(String args[]) {

        int num1 = 20;
        int num2 = 30;

        int result = add(num1, num2);

        System.out.println(result);

        //System.out.println(cal.add(num1, num2));

    }
}



// class Calculator
// {
//     public void add(int n1, int n2)
//     {
//         int r = n1 + n2;
//         System.out.println(r);
//     }
// }


// public class ClassAndObject {
    
//     public static void main(String args[]) {

//         int num1 = 20;
//         int num2 = 30;

//         Calculator cal  = new Calculator();
//         //int result = cal.add(num1, num2);
//         cal.add(num1, num2);

//         // System.out.println(result);

//     }
// }

