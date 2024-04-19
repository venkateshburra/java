package CollectionInterFaces;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String args[])
    {
        
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
