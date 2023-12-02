
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student(3, "Иванов", "Иван", "Иванович");
        Student stud2 = new Student(4, "Петров", "Петр", "Иванович");
        Student stud3 = new Student(1, "Куликов", "Александр", "Петрович");
        Student stud4 = new Student(2, "Зайцев", "Игорь", "Сергеевич");
        Student stud5 = new Student(2, "Зайцев1", "Игорь", "Сергеевич");
        Student stud6 = new Student(2, "Зайцев2", "Игорь", "Сергеевич");

        List<Student> studentsGr = new ArrayList<>();

        studentsGr.add(stud1);
        studentsGr.add(stud2);
        studentsGr.add(stud3);
        studentsGr.add(stud4);
        studentsGr.add(stud5);
        studentsGr.add(stud6);

        Student stud01 = new Student(98, "Иванова", "Мария", "Ивановна");
        Student stud02 = new Student(67, "Петрова", "Ирина", "Владимировна");
        Student stud03 = new Student(47, "Куликова", "Александра", "Петровна");
        Student stud04 = new Student(26, "Зайцева", "Юлия", "Александровна");

        List<Student> studentsGr2 = new ArrayList<>();

        studentsGr2.add(stud01);
        studentsGr2.add(stud02);
        studentsGr2.add(stud03);
        studentsGr2.add(stud04);

        Student stud20 = new Student(3, "Фролов", "Иван", "Иванович");
        Student stud21 = new Student(4, "Юнусов", "Петр", "Иванович");
        Student stud22 = new Student(1, "Чехов", "Александр", "Петрович");
        Student stud23 = new Student(2, "Пушкин", "Игорь", "Сергеевич");

        List<Student> studentsGr3 = new ArrayList<>();

        studentsGr3.add(stud20);
        studentsGr3.add(stud21);
        studentsGr3.add(stud22);
        studentsGr3.add(stud23);

        Student stud11 = new Student(98, "Солдатова", "Мария", "Ивановна");
        Student stud12 = new Student(67, "Марусова", "Ирина", "Владимировна");
        Student stud13 = new Student(47, "Иголкина", "Александра", "Петровна");
        Student stud14 = new Student(26, "Ёлкина", "Юлия", "Александровна");

        List<Student> studentsGr4 = new ArrayList<>();

        studentsGr4.add(stud11);
        studentsGr4.add(stud12);
        studentsGr4.add(stud13);
        studentsGr4.add(stud14);

        StudentGroup studentGroup = new StudentGroup(studentsGr);
        StudentGroup studentGroup2 = new StudentGroup(studentsGr2);
        StudentGroup studentGroup3 = new StudentGroup(studentsGr3);
        StudentGroup studentGroup4 = new StudentGroup(studentsGr4);

        List<StudentGroup> stream01 = new ArrayList<>();
        stream01.add(studentGroup);
        stream01.add(studentGroup2);

        List<StudentGroup> stream02 = new ArrayList<>();
        stream02.add(studentGroup3);
        stream02.add(studentGroup4);

        Stream stream449 = new Stream(stream01);
        // Сортировка
        StreamService serviceStream = new StreamService(stream449);

        for (StudentGroup i : serviceStream.getSortedStream()) {
        System.out.println(i);
        }
        
        // Ниже итераторы while и foreach
        
         // StreamIterator iterateStream = new StreamIterator(stream449);

        // while (iterateStream.hasNext()) {
        // System.out.println();
        // System.out.println(iterateStream.next());
        // System.out.println();
        // }

        // for (StudentGroup i: stream449) {
        // System.out.println(i);
        // }

    }

}
