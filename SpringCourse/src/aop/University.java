package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Gryzlov Vlad", 3, 7.8);
        Student st2 = new Student("Zaur Tregulov", 4, 7.5);
        Student st3 = new Student("Elena Sidorova", 4, 6.3);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
//        System.out.println(students.get(3));
        System.out.println("Информация из метода getStudents: ");
        System.out.println(students);
        return students;
    }
}
