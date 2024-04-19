package encapsulation;
// class human
// {
//      private String name = "mahesh";
//      private int age = 24;

//      public String getName()
//      {
//         return name;
//      }

//      public int getAge()
//      {
//         return age;
//      }
// }


// public class encapsulation {
//     public static void main(String args[])
//     {
//         human obj = new human();
//         // obj.name = "venkatesh";
//         // obj.age = 19;

//         System.out.println(obj.getName() + " : " + obj.getAge());
        
//     }
// }


//access from another class by using methods
public class human
{
     private String name;
     private int age;

     public String getName()
     {
        return name;
     }

     public void setName(String n)
     {
        name = n;
     }

     public int getAge()
     {
        return age;
     }

     public void setAge(int a)
     {
        age = a;
     }
}


public class encapsulation {
    public static void main(String args[])
    {
        human obj = new human();

        obj.setName("mahesh");
        obj.setAge(25);

        System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
}
