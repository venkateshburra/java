package CollectionInterFaces;


import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String args[])
    {
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
    }
}
