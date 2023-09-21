class GradeHigh
{
    public void grades(int marks)
    {
        if(marks>=90){
            System.out.println("Grade `A` for mark = " +marks);
        }
        else if(marks>=50 && marks<70){
            System.out.println("Grade `B` for mark = "+marks);
        }
    }
}
class GradeLow extends GradeHigh
{
    @Override
    public void grades(int marks) {
        if(marks>=30 && marks<50)
        {
            System.out.println("Grade `C` for mark = "+marks);
        }
        else if(marks<30)
        {
            System.out.println("Grade `D` for mark = "+marks);
        }
        super.grades(100);
        super.grades(21);
    }
}
public class OverRiding {
    public static void main(String[] args) {
        GradeHigh gradeA = new GradeHigh();
        gradeA.grades(91);
        gradeA.grades(51);
        gradeA.grades(97);
        GradeLow gradeLow = new GradeLow();
        gradeLow.grades(31);
        gradeLow.grades(99);
        gradeA.grades(21);
    }
}
