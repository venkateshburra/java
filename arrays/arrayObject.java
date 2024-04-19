package arrays;
class students
{
    int rollno;
    String name;
    int marks;
}

public class arrayObject {
    public static void main(String args[]) {

        students s1 = new students();
        s1.rollno = 1;
        s1.name = "venkatesh";
        s1.marks = 85;

        students s2 = new students();
        s2.rollno = 2;
        s2.name = "mahesh";
        s2.marks = 95;

        students s3 = new students();
        s3.rollno = 3;
        s3.name = "navya";
        s3.marks = 90;

        students students[] = new students[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i = 0; i < students.length; i++)
        // {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }
        
        for(students stud : students)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }
}
    
    
}