package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
//        Person person = context.getBean("person", Person.class);
//        person.callPet();
//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();
        Person person = context.getBean("person", Person.class);
//        person.callPet();
//        Person person2 = context.getBean("person", Person.class);
        System.out.println(person.getSurname() + " " + person.getAge());
        context.close();
    }
}
