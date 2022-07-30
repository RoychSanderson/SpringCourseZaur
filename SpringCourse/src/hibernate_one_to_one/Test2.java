package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
//            Employee emp = new Employee("Nikolay", "Ivanov", "HR", 850);
//            Detail detail = new Detail("NewYork", "56837312", "nikayork@gmail.com");
//            emp.setEmpDetail(detail);
//            detail.setEmployee(emp);
//
//            session.beginTransaction();
//            session.save(detail);
//            session.getTransaction().commit();
//
//            System.out.println("Done");

//            Employee emp = new Employee("Zaur", "Tregulov", "IT", 500);
//            Detail detail = new Detail("Baku", "123456789", "zaurtregulov@gmail.com");
//            emp.setEmpDetail(detail);
//            detail.setEmployee(emp);


            session.beginTransaction();
//            session.save(detail);
            Detail detail = session.get(Detail.class, 6);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();

            System.out.println("Done");
        }
        finally {
            session.close();
            factory.close();
        }

    }
}
