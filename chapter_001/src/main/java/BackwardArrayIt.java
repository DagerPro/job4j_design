import java.util.Iterator;
import java.util.NoSuchElementException;

public class BackwardArrayIt implements Iterator<Integer> {
    private final int[] data;
    private int point = 0;

    public BackwardArrayIt(int[] data) {
        this.data = data;
    }


    public boolean hasNext() {
        return point < data.length;
    }


    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        point++;
        return data[data.length - point];

    }


    public void remove() {
    }


}
