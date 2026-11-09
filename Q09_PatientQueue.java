import java.util.*;
public class Q09_PatientQueue {
    static class Patient { int id; String name;
        Patient(int id,String name){this.id=id;this.name=name;}
        public String toString(){return id+" "+name;}
    }
    static void addPatient(Queue<Patient> q,Patient p){q.offer(p);}
    static void servePatient(Queue<Patient> q){Patient p=q.poll();System.out.println(p==null?"No patients": "Serving: "+p);}
    public static void main(String[] args) {
        Queue<Patient> patients=new LinkedList<>();
        addPatient(patients,new Patient(1,"Aman")); addPatient(patients,new Patient(2,"Sara"));
        System.out.println("Queue: "+patients); servePatient(patients); System.out.println("Waiting: "+patients);
    }
}
