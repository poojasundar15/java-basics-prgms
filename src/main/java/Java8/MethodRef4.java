package Java8;

import java.util.function.BiFunction;

public class MethodRef4 {
    public static String display(String a,String b){
        System.out.println("This program '"+a+"' Simple method reference.");
        return a;
    }

    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction = MethodRef4::display;
        String result = biFunction.apply("MethodRef4","ksj");
    }
}
