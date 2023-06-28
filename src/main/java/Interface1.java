public interface Interface1 {
    void sum();
}
abstract class Addition implements Interface1 {
    abstract void add();
}
abstract class Subtraction extends Addition
{
    abstract void sub();
}
