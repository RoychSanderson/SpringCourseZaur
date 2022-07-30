package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee emp = new Employee("Zaur", "Tregulov", "IT", 500);
//            Detail detail = new Detail("Baku", "3874639", "kakoj-to mail");
//            emp.setEmpDetail(detail);
//            session.save(emp);
//
//            System.out.println("Done");
//            session.getTransaction().commit();

//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee emp = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moscow", "587493", "kakoj-to mail Olega");
//            emp.setEmpDetail(detail);
//            session.save(emp);
//
//            System.out.println("Done");
//            session.getTransaction().commit();

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            System.out.println("Done");
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }

    }
}
