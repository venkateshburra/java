package CollectionInterFaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class arrayllist {
    public static void main(String ags[])
     {
          
        //COLLECTION

        List<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(15);
        number.add(20);  //not support index
        number.add(25);
        System.out.println(number);
       for(int n : number)
    {
       System.out.println(n);
    }

    //LIST

        List<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(15);
        num.add(20);
        num.add(25);

       System.out.println(num.get(2));  //support index numbers //suppport same numbers
       System.out.println(num.indexOf(15));
        for(int n : num)
        {
            System.out.println(n);
        }

        //SET  //it is a collection of unique numbers

        Set<Integer> num1 = new HashSet<Integer>(); //for sorting we have to TreeSet
        num1.add(10);
        num1.add(15);
        num1.add(20);
        num1.add(25);
        num1.add(15);

       //not support index numbers //not suppport same numbers
       System.out.println(num1);
        for(int n : num1)
        {
            System.out.println(n);
        }


        //MAP

        Map<String, Integer> students = new HashMap<>();
        students.put("venky", 50);
        students.put("mahesh", 100);
        students.put("navya", 150);
        students.put("sahul", 200);

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.get("venky"));

        for(String key : students.keySet())
        {
            System.out.println(key + ":" + students.get(key));
        }

    }
}
