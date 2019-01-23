package chapter01.fibonacci;

/**
 * Created by esuv on 1/13/19
 */
public class Fibonacci extends Thread {
    private final int value;
    private int result;

    public Fibonacci(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(5);
        fibonacci.start();
    }

    @Override
    public void run() {
//        if ()
    }

    public int getResult() {
        return result;
    }
}
