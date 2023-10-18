import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

public class ImmutableCollectionExamples {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Vikram", 100, 130000));
        employeeList.add(new Employee("Karan", 100, 120000));
        employeeList.add(new Employee("Karan", 100, 110000));
        employeeList.add(new Employee("Moin", 500, 300000));
        employeeList.add(new Employee("Pratik", 200, 120000));
        employeeList.add(new Employee("Komal", 100, 100000));

        Employee vikramEmp = new Employee("Vikram", 100, 130000);

        //List.of method returns immutable list
        //cannot be added or removed items from the list

        List<Employee> immutableList = List.of(
                vikramEmp,
                new Employee("Karan", 100, 120000),
                new Employee("Karan", 100, 110000),
                new Employee("Moin", 500, 300000)
        );
    }
}
