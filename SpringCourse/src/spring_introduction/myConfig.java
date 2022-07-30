package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("myApp.properties")
//@ComponentScan("spring_introduction")
public class myConfig {
    @Bean
    @Scope()
    public Pet catBean(){
//        System.out.println("Creation of bean");
        return new Cat();
    }
    @Bean
    @Scope
    public Person person(){
        return new Person(catBean());
    }
}
