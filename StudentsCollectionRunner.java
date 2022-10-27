import java.util.*;

class AscendingStudentComparatorRunner implements Comparator<Student>{

    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(),student2.getId());
    }

   // public Comparator<Student> reversed() {
      //  return Comparator.super.reversed();
   // }
}
public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1,"ranga");
                new Student(100,"adam"),new Student(2,"eve"));
        List<Student> studentsAl = new ArrayList<>(students);

        System.out.println(studentsAl);
        Collections.sort(studentsAl);
        System.out.println("Descending"+  studentsAl);
        Collections.sort(studentsAl, new AscendingStudentComparatorRunner());
        System.out.println("Ascending"+  studentsAl);

    }
}