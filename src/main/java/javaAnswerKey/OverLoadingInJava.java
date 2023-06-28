package javaAnswerKey;

class Students
{
    public void studentsMarks(){
        System.out.println("First Method");
    }
    public void studentsMarks(int a)
    {
        System.out.println("Second method");
    }
    public void studentsMarks(int b, double c)
    {
        System.out.println("Third method");
    }
}
public class OverLoadingInJava {
    public static void main(String[] args) {
        Students obj = new Students();
        obj.studentsMarks();
        obj.studentsMarks(2);
        obj.studentsMarks(3,6.6);
    }
}
