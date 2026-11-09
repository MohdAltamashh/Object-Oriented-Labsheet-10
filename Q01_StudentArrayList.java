import java.util.*;
public class Q01_StudentArrayList {
    static class Student {
        String name; Student(String name) { this.name = name; }
        void display() { System.out.println(name); }
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Aman")); students.add(new Student("Sara")); students.add(new Student("Ravi"));
        students.remove(1);
        for (Student s : students) s.display();
    }
}
