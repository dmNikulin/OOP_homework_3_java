import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        int resultOfComparing = o1.getStudents().size() - o2.getStudents().size();

        if (resultOfComparing > 0)
            return 1;
        if (resultOfComparing < 0)
            return -1;
        else
            return 0;
    }

}
