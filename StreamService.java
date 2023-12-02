import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public List<StudentGroup> getSortedStream (){
        List<StudentGroup> listStudentsGroup = new ArrayList<>(stream.getStream());
        listStudentsGroup.sort(new StreamComparator());
        return listStudentsGroup;
    }
}
