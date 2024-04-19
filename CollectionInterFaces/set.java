package CollectionInterFaces;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String args[])
    {
        //SET  //it is a collection of unique numbers

        Set<Integer> num = new HashSet<Integer>(); //for sorting we have to TreeSet
        num.add(10);
        num.add(15);
        num.add(20);
        num.add(25);
        num.add(15);

       //not support index numbers //not suppport same numbers
       System.out.println(num);
        for(int n : num)
        {
            System.out.println(n);
        }

    }
}
