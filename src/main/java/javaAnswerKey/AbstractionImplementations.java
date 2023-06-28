package javaAnswerKey;

abstract class First
{
    abstract public void displayAbstract(); //Abstract method
}
class AbstractImpl extends First{

    @Override
    public void displayAbstract() {
        System.out.println("Abstract Class");

    }
}

public class AbstractionImplementations {
    public static void main(String[] args) {
        AbstractImpl anAbstract = new AbstractImpl();
        anAbstract.displayAbstract();
    }
}
