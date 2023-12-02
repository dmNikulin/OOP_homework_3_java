

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> student;
    private int counter;


    public StudentGroupIterator(StudentGroup studentGroup) {
        this.student = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < student.size();
    }

    @Override
    public Student next() {
        if (hasNext()){
            return student.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        student.remove(counter);
    }
}
