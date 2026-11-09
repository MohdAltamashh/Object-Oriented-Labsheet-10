import java.util.*;
public class Q07_CustomerVector {
    static class Customer {
        private int id; private String name,email;
        Customer(int id,String name,String email){this.id=id;this.name=name;this.email=email;}
        public int getId(){return id;} public void setId(int id){this.id=id;}
        public String getName(){return name;} public void setName(String name){this.name=name;}
        public String getEmail(){return email;} public void setEmail(String email){this.email=email;}
        void display(){System.out.println(id+" "+name+" "+email);}
    }
    public static void main(String[] args) {
        Vector<Customer> customers=new Vector<>();
        customers.add(new Customer(1,"Aman","aman@example.com"));
        customers.add(new Customer(2,"Sara","sara@example.com"));
        for(Customer c:customers)c.display();
    }
}
