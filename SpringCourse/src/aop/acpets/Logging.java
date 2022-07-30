package aop.acpets;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class Logging {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUni(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUni(){}
//
//    @Pointcut("allMethodsFromUni() && !returnMagazineFromUni()")
//    private void allApartReturnMagazine(){}
//
//    @Before("allApartReturnMagazine()")
//    private void beforeAllMethodsApartReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsApartReturnMagazineAdvice: Log #10");
//    }
//




//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsUni(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsUni(){}
//
//    @Pointcut("allGetMethodsUni() || allReturnMethodsUni()")
//    private void allGetAndReturnMethodsUni(){}
//
//    @Before("allGetMethodsUni()")
//    private void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsUni()")
//    private void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsUni()")
//    private void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }


    @Before("aop.acpets.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());
        if (methodSignature.getName().equals("addBook")){
            Object [] arguments = joinPoint.getArgs();
            for (Object object:arguments){
                if(object instanceof Book){
                    Book myBook = (Book) object;
                    System.out.println("Информация о книге: название - " + myBook.getName()
                            + ", автор - " + myBook.getAuthor()
                            + ", годы выпуска - " + myBook.getYearOfPublication());
                } else {
                    if (object instanceof  String) System.out.println("Книгу в библиотеку добавляет " + object);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: логгирование попытки получить книгу или журнал");
        System.out.println("-----------------------------------");
    }


}
