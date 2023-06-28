package cat2;

class Task implements Runnable {
    private char letter;

    public Task(char letter) {
        this.letter = letter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(letter);
        }
    }
}

public class ThreeThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task('a'));
//        Thread thread2 = new Thread(new Task('b'));
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 100; i++) {
//                    System.out.print(i + " ");
//                }
//            }
//        });

        thread1.start();
//        thread2.start();
//        thread3.start();
    }
}

