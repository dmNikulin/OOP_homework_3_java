
import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private final List<StudentGroup> stream;
    private int counter = 0;

    public StreamIterator(Stream stream) {
        this.stream = stream.getStream();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < stream.size();
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) {
            return stream.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        stream.remove(counter);
    }

}
