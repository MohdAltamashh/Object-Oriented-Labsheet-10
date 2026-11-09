import java.util.*;
public class Q04_ProductTreeSet {
    static class Product implements Comparable<Product> {
        int id; String name; double price;
        Product(int id,String name,double price){this.id=id;this.name=name;this.price=price;}
        double getPrice(){return price;}
        void display(){System.out.println(id+" "+name+" Rs."+price);}
        public int compareTo(Product p){int c=Double.compare(price,p.price);return c!=0?c:Integer.compare(id,p.id);}
    }
    public static void main(String[] args) {
        TreeSet<Product> products=new TreeSet<>();
        products.add(new Product(1,"Pen",10)); products.add(new Product(2,"Bag",800));
        products.add(new Product(3,"Book",60)); products.add(new Product(4,"Bottle",150));
        products.add(new Product(5,"Laptop",45000));
        for(Product p:products)p.display();
    }
}
