import java.util.*;
public class Q10_DepartmentTeacher {
    static class Department {
        String name; Department(String name){this.name=name;}
        public String toString(){return name;}
        public int hashCode(){return Objects.hash(name);}
        public boolean equals(Object o){return o instanceof Department && name.equals(((Department)o).name);}
    }
    static class Teacher extends Department {
        String teacherName; // Teacher is a Department subclass as specified in the question.
        Teacher(String departmentName,String teacherName){super(departmentName);this.teacherName=teacherName;}
        public String toString(){return teacherName;}
    }
    static void addTeacher(ArrayList<Department> departments,
        HashMap<Department,List<Teacher>> map,Department department,Teacher teacher) {
        if(!departments.contains(department))departments.add(department);
        map.computeIfAbsent(department,k->new ArrayList<>()).add(teacher);
    }
    static void display(ArrayList<Department> departments,HashMap<Department,List<Teacher>> map) {
        for(Department d:departments) {
            System.out.println(d.name+":");
            for(Teacher t:map.getOrDefault(d,Collections.emptyList()))System.out.println("  "+t.teacherName);
        }
    }
    public static void main(String[] args) {
        ArrayList<Department> departments=new ArrayList<>();
        HashMap<Department,List<Teacher>> map=new HashMap<>();
        Department cs=new Department("Computer Science"), math=new Department("Mathematics");
        addTeacher(departments,map,cs,new Teacher("Computer Science","Dr. Khan"));
        addTeacher(departments,map,cs,new Teacher("Computer Science","Ms. Sharma"));
        addTeacher(departments,map,math,new Teacher("Mathematics","Mr. Verma"));
        display(departments,map);
    }
}
