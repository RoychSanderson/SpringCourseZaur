package aop.acpets;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewLogging {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "пытаются вернуть книгу");
//        long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice:" +
                    " залоггировано исключение " + e);
            throw e;
        }

//        targetMethodResult = "1942";
//        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "успешно вернули книгу");
//        System.out.println("Прошло времени " + (end-begin));
        return targetMethodResult;
    }
}
