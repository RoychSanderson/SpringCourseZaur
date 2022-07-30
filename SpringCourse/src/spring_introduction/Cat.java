package spring_introduction;

import org.springframework.stereotype.Component;

//@Component()
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat has awoken as a bean");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
