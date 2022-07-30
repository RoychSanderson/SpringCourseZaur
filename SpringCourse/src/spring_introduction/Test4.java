package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog mydog = context.getBean("myPet", Dog.class);
        //mydog.setName("Belka");
        Dog ourdog = context.getBean("myPet", Dog.class);
        //ourdog.setName("Strelka");

        //System.out.println(mydog.getName());
       // System.out.println(ourdog.getName());

        //System.out.println(mydog == ourdog);

        context.close();
    }
}
