package javaAnswerKey;

import java.util.Scanner;

class Addition {
    int a;
    public void add2(int b){
        System.out.println("Enter the a value = ");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        int add=a+a;
        System.out.println(add);
    }
}
class A2 extends Addition{

}
public class ClassAndObject {
    public static void main(String[] args) {
        Addition o = new Addition();  //Object creating syntax
        o.add2(5);
    }
}


