package cat2;

class Fibonacci implements Runnable {
    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            if (i % 10 == 0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            a = b;
            b = c;
        }
    }
}
public class FiboThread
{
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(11);
        Thread thread = new Thread(fibonacci);
        thread.start();
    }
}

