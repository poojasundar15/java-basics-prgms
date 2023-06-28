package BASICPROGRAMS;
import pack1.Arithmetic;
import pack2.Calculator;

class CalculatorImpl implements Arithmetic, Calculator {
    @Override
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

public class CalculatorImplementation {
    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();

        // Perform arithmetic operations
        calculator.add(10, 5);
        calculator.sub(10, 5);

        // Perform calculator operations
        calculator.multiply(10, 5);
        calculator.divide(10, 5);
        calculator.divide(10, 5);
    }
}
