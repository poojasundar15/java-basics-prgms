package javaAnswerKey;

import javaAnswerKey.Pack1;

interface Pack2 {
    void multiply(); //normal method
    void div();
}
public class Interface implements Pack1,Pack2
{
    @Override
    public void multiply() {
    }

    @Override
    public void div() {

    }

    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }

    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.add();
        obj.sub();
        obj.multiply();
        obj.div();
    }
}

