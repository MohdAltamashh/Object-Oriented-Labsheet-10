import java.util.*;
public class Q05_StudentHashMap {
    static class Student {
        String name; Student(String name){this.name=name;}
        void display(int roll){System.out.println("Roll: "+roll+", Name: "+name);}
    }
    static void addStudent(Map<Integer,Student> map,int roll,Student s){map.put(roll,s);}
    static void removeStudent(Map<Integer,Student> map,int roll){map.remove(roll);}
    static void displayStudents(Map<Integer,Student> map){map.forEach((r,s)->s.display(r));}
    public static void main(String[] args) {
        HashMap<Integer,Student> students=new HashMap<>();
        addStudent(students,101,new Student("Aman")); addStudent(students,102,new Student("Sara"));
        removeStudent(students,102); displayStudents(students);
    }
}
