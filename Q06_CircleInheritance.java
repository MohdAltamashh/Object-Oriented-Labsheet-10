import java.util.*;
public class Q06_CircleInheritance {
    static class Shape { double area(){return 0;} }
    static class Circle extends Shape {
        double radius; Circle(double radius){this.radius=radius;}
        @Override double area(){return Math.PI*radius*radius;}
    }
    public static void main(String[] args) {
        ArrayList<Shape> shapes=new ArrayList<>();
        shapes.add(new Circle(2)); shapes.add(new Circle(5)); shapes.add(new Circle(7));
        for(Shape s:shapes)System.out.printf("Area = %.2f%n",s.area());
    }
}
