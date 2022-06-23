import java.util.*;

public class Randoms implements Iterable<Integer> {
    private final Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt((max - min) + 1) + min;
        }
    }
}