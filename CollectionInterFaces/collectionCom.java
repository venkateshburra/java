package CollectionInterFaces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students
{
    int age;
    String name;

    public Students(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "Students {age = " + age + ", name = " + name + "}" ;
    }
}

public class collectionCom {
    public static void main(String args[])
    {
        Comparator<Students> com = new Comparator<Students>()
        {
            public int compare(Students i, Students j)
            {
                if(i.age> j.age)
                    return 1;
                else
                    return -1;
            }
        };
    //     List<Integer> nums = new ArrayList<>();
    //     nums.add(43);
    //     nums.add(33);
    //     nums.add(72);
    //     nums.add(29);

    //     Collections.sort(nums,com);
    //    System.out.println(nums);


        List<Students> studs = new ArrayList<>();
        studs.add(new Students(18,"venky"));
        studs.add(new Students(29,"navya"));
        studs.add(new Students(30,"mahesh"));
        studs.add(new Students(21,"sahul"));

        //System.out.println(studs);
        Collections.sort(studs,com);
        for(Students s : studs)
        {
            System.out.println(s);
        }

    }
}
