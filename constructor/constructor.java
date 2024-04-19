package constructor;
import encapsulation.human;

class human
        {
            private String name;
            private int age;

            public human()    //default constructor
            {
                age = 19;
                name = "navya";
            }

            public human(int a, String n)   //parameterized constructor
            {
                this.age = a;
                this.name = n;
            }

            public String getName()
            {
                return name;
            }

            public void setName(String name)
            {
                this.name = name;
            }

            public int getAge()
            {
                return age;
            }

            public void setAge(int age)
            {
                this.age = age;
            }
        }


public class constructor {
    public static void main(String args[])
        {
            human obj = new human();
             human obj1 = new human(12, "venky");


            // obj.setName("mahesh");
            // obj.setAge(25);

            System.out.println(obj.getName() + " : " + obj.getAge());
            System.out.println(obj1.getName() + " : " + obj1.getAge());

            
        }
}
