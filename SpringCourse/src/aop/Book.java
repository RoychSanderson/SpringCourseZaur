package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Lord of the Rings")
    private String name;

    @Value("Tolkin")
    private String author;

    @Value("1942")
    private int yearOfPublication;

    public String getName(){
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
