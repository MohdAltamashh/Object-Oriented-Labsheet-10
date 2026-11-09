import java.util.*;
public class Q02_EmployeeLinkedList {
    static class Person { String name; Person(String name) { this.name = name; } }
    static class Employee extends Person {
        int id; String department;
        Employee(int id, String name, String department) { super(name); this.id=id; this.department=department; }
        void display() { System.out.println(id + " " + name + " " + department); }
    }
    static void addEmployee(LinkedList<Employee> list, Employee e) { list.add(e); }
    static void displayEmployees(LinkedList<Employee> list) { for (Employee e : list) e.display(); }
    static void searchByName(LinkedList<Employee> list, String name) {
        for (Employee e : list) if (e.name.equalsIgnoreCase(name)) { e.display(); return; }
        System.out.println("Employee not found");
    }
    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<>();
        addEmployee(list,new Employee(1,"Aman","IT")); addEmployee(list,new Employee(2,"Sara","HR"));
        displayEmployees(list); System.out.println("Search result:"); searchByName(list,"Sara");
    }
}
