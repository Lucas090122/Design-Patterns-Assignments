import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Sequence fibSeq = new FibonacciSequence(10);
        Iterator<Integer> iterator = fibSeq.iterator();

        System.out.println("First 10 Fibonacci numbers:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
