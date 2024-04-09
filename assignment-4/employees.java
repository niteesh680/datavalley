import java.util.Collections;
import java.util.LinkedList;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String designation;
    double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison == 0) {
            return Double.compare(this.salary, other.salary);
        }
        return nameComparison;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
    }
}

public class SortEmployeeLinkedList {

    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(101, "Alice", "Software Engineer", 80000));
        employees.add(new Employee(103, "Bob", "Manager", 95000));
        employees.add(new Employee(102, "Charlie", "Data Scientist", 88000));

        // Sort by name and salary using Comparable
        Collections.sort(employees);

        System.out.println("Sorted by Name and Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
