package aop.acpets;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLogging {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLogging(){
//        System.out.println("beforeGetStudentsLogging: " +
//                "логируем получение списка студентвов перед методом getStudents");
//
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())"
//    , returning = "students")
//    public void afterReturningGetStudentsLogging(List<Student> students){
//
//        Student first = students.get(0);
//        String nameSurname = first.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        first.setNameSurname(nameSurname);
//
//        double avgGrade = first.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        first.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLogging: " +
//                "логируем получение списка студентвов после метода getStudents");
//
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "e")
//    public void afterThrowingGetStudentsLogging(Throwable e){
//        System.out.println("afterThrowingGetStudentsLogging: " +
//                "логгируем исключение " + e);
//
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логгируем нормальное завершение или выброс исключения");

    }
}
