package aop.acpets;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandling {
    @Before("aop.acpets.MyPointCuts.allAddMethods()")
    public void beforeAddException(){
        System.out.println("beforeGetException: ловим и обрабатываем исключения при попытке получить книгу/журнал");
        System.out.println("-----------------------------------");
    }
}
