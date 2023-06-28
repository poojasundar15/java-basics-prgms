package Java8;

interface MethodRef{
    void sampleMethodRef();
}
public class MethodReference
{
    public static void sampleMethodReference(){
        System.out.println("This is an example of Method reference");
    }

    public static void main(String[] args) {
        MethodRef methodRef = MethodReference::sampleMethodReference;
        methodRef.sampleMethodRef();

    }
}
