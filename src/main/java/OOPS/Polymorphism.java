package OOPS;

class PolymorphismOverLoading
{
    public void gradeConversion(int marks)
    {
        if(marks>=90){
            System.out.println("Grade `A`");
        }
        if(marks>=50&&marks<70){
            System.out.println("Grade `B`");
        }
    }
}
class Polymorphism1 extends PolymorphismOverLoading
{
    public void gradeConversion(int marks)
    {
        if(marks>=30&&marks<50)
        {
            System.out.println("Grade `C`");
        }
        else if(marks<30)
        {
            System.out.println("Grade `D'");
        }
        super.gradeConversion(44);

    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Polymorphism1 polymorphism1 = new Polymorphism1();
//        OOPS.PolymorphismOverLoading polymorphismOverLoading = new OOPS.PolymorphismOverLoading();
//        polymorphismOverLoading.gradeConversion(100);
        polymorphism1.gradeConversion(88);
        polymorphism1.gradeConversion(99);
        polymorphism1.gradeConversion(54);
//        polymorphismOverLoading.gradeConversion(21);




    }
}
