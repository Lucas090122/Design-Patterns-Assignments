import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private int count = 0;
    private final int limit;
    private int prev = 0;
    private int curr = 1;

    public FibonacciIterator(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return count < limit;
    }

    @Override
    public Integer next() {
        int result = curr;
        int next = prev + curr;
        prev = curr;
        curr = next;
        count++;
        return result;
    }
}
