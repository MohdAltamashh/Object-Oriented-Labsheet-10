import java.util.*;
public class Q03_BookHashSet {
    static class Book {
        int id; String title, author;
        Book(int id,String title,String author){this.id=id;this.title=title;this.author=author;}
        void display(){System.out.println(id+" "+title+" by "+author);}
        public int hashCode(){return Integer.hashCode(id);}
        public boolean equals(Object o){return o instanceof Book && ((Book)o).id==id;}
    }
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book(1,"Java Basics","James")); books.add(new Book(2,"OOP","David"));
        books.add(new Book(1,"Duplicate Java","Other"));
        for(Book b:books)b.display();
        System.out.println("Only unique book IDs are stored.");
    }
}
