package hibernate_one_to_many_bi.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String department_name;

    @Column(name = "max_salary")
    private int max_salary;

    @Column(name = "min_salary")
    private int min_salary;

    @OneToMany(cascade = CascadeType.ALL
            , mappedBy = "department"
            , fetch = FetchType.LAZY)
    private List<Employee> employeeList;

    public Department() {
    }

    public Department(String department_name, int max_salary, int min_salary) {
        this.department_name = department_name;
        this.max_salary = max_salary;
        this.min_salary = min_salary;
    }

    public void addEmployeeToDepartment(Employee employee){
        if(employeeList == null){
            employeeList = new ArrayList<Employee>();
        }
        employeeList.add(employee);
        employee.setDepartment(this);

    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(int max_salary) {
        this.max_salary = max_salary;
    }

    public int getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(int min_salary) {
        this.min_salary = min_salary;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department_name='" + department_name + '\'' +
                ", max_salary=" + max_salary +
                ", min_salary=" + min_salary +
                '}';
    }
}
