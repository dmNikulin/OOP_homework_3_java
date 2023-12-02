

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup students;

    public StudentGroupService(StudentGroup students) {
        this.students = students;
    }

    public StudentGroup getStudents() {
        return students;
    }

    public void removeStudent(Student student){
        for (Student i : students) {
            if(i.equals(student)) {
                students.remove(i);
            }
        }
    }

    public List<Student> getSortedStudentsGroup(){
        List<Student> students1 = new ArrayList<>(students.getStudents());
        Collections.sort(students1);;
        return students1;
    }

    public List<Student> getSortedStudentsGroupByFIO(){
        List<Student> listStudents = new ArrayList<>(students.getStudents());
        listStudents.sort(new StudentGroupComparator());
        return listStudents;
    }
}
