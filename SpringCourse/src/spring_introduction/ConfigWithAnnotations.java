package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean(Person.class);
        person.callPet();
        System.out.println(person.getSurname() + " " + person.getAge());
//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        context.close();
    }
}
