package javaAnswerKey;

class Student
{
    public void studentMark()
    {
        System.out.println("Super Class");
    }
}
class Student1 extends Student{

    @Override
    public void studentMark() {
        super.studentMark();
    }
}
public class OverRidingInJava {
    public static void main(String[] args) {
        Student1 obj= new Student1();
        obj.studentMark();
        Student obj1 = new Student();
        obj1.studentMark();
    }
}
