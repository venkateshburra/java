package CollectionInterFaces;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String args[])
    {
          //COLLECTION
          Collection<Integer> num = new ArrayList<Integer>();
          num.add(10);
          num.add(15);
          num.add(20);  //not support index
          num.add(25);
          System.out.println(num);
         for(int n : num)
        {
            System.out.println(n);
        }
    }
}
