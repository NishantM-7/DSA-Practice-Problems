
class Circle {
    public double radius;
    int x = 20;

    // public Circle() {
    // System.out.println("Parent Class Constructor");
    // // radius = 10.0;
    // }

    public Circle(double radius) {
        // this();
        System.out.println("Parameterized Constructor of Parent Class");
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

}

class Cylinder extends Circle {
    public double height;
    int x = 100;

    // public Cylinder() {
    // // super(90);
    // System.out.println("Child Class Constructor");

    // // System.out.println(this.x); //Calls x =100 , current class property.

    // // System.out.println(super.x); // Calls x=20 , super class property.

    // // height = 1.0;
    // // radius = 5.0;

    // }

    public Cylinder(double height) {
        super(10);
        this.height = height;
        System.out.println("Parameterized Constructor of child class");
    }

    double volume() {
        return area() * height;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        // Circle cr = new Circle();
        Cylinder c = new Cylinder(90);
        // c.radius = 10;
        // c.height = 10;
        // System.out.println(c.radius);
        // System.out.println(cr.radius);
        // System.out.println("Volume:" + c.volume());
        // System.out.println("Area: "+ c.area());
    }
}
