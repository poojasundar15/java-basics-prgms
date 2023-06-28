package Java8;

import java.util.function.BiFunction;

interface Method2{
    void methodRef();
}
class Method3 {
    public static int sub(int a, int b) {
        return a - b;
    }
}
public class MethodReference2 {
    public static int add() {
        int a = 7, b = 2;
        return a+b;
    }
    public static void main(String[] args) {
        Method2 method2 = MethodReference2::add;
        System.out.println(method2);
        BiFunction<Integer,Integer,Integer> biFunction = Method3::sub;
        int result = biFunction.apply(100,11);
        System.out.println(result);

    }
}
