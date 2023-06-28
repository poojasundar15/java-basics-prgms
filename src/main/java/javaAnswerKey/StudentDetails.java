package javaAnswerKey;

abstract class Student11
{
    abstract public void display();
}
class StudentImplementations extends Student11
{
    public int reg_no=1298;
    public String name="PoojaSundar";
    public int mark=987;
    public void display()
    {
        System.out.println("----Student Details----");
        System.out.println("Student Register Number = " +reg_no);
        System.out.println("Student Name = " +name);
        System.out.println("Student Mark = " +mark);
    }
}
public class StudentDetails
{
    public static void main(String[]args)
    {
        StudentImplementations obj = new StudentImplementations();
        obj.display();
    }
}
