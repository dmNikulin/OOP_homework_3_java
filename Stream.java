import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> stream = new ArrayList<>();

    public Stream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return "Stream [stream=" + stream + "]";
    }

}
