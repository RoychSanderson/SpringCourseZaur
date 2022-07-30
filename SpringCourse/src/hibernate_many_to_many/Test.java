package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Olya", 12);
//            Child child2 = new Child("Grisha", 8);
//            Child child3 = new Child("Pavel", 9);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.persist(section1);

//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Math");
//            Section section3 = new Section("Chess");
//            Child child1 = new Child("Igor", 5);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//            session.save(child1);

//            Section section = session.get(Section.class, 2);
//            System.out.println(section);
//            System.out.println(section.getChildren());

//            Child child = session.get(Child.class, 6);
//            System.out.println(child);
//            System.out.println(child.getSectionList());

//            Section section = session.get(Section.class, 7);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            Child child = session.get(Child.class, 7);
            session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done");

        }
        finally {
            session.close();
            factory.close();
        }

    }
}
