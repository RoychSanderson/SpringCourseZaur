package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
           session = factory.getCurrentSession();
           session.beginTransaction();

//            Department dep = new Department("HR", 500, 1500);
//            Employee emp1 = new Employee("Oleg", "Ivanov", 800);
//            Employee emp2 = new Employee("Andrey", "Sidorov", 1000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            session.save(dep);

//            Employee employee = session.get(Employee.class, 5);
//            Department department = session.get(Department.class, 3);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());

            Department department = session.get(Department.class, 3);
            session.delete(department);

            System.out.println("Done");
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }

    }
}