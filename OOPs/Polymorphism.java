import java.util.Arrays;

public class Polymorphism {
    public static void main(String[] args) {
        // Shape shape = new Shape();
        // Circle circle = new Circle();
        // Square square = new Square();

        // shape.area();
        // circle.area();
        // square.area();

        Shape circle = new Circle(); // this is known as Upcasting (super class
        // reference but child class object)
        /*
         * The reference variable decides what you can access , but if the parent class
         * and the child class have the same functions,
         * the jvm decides which method to call during runtime.
         * The method of the Object type mentioned ( here Circle()) is called by
         * overriding the parent class method .
         * This is called runtime polymorphism or dynamic polymorphism.
         *
         * dynamic method dispatch - It is the process through which a call to an
         * overridden method is resolved at runtime.
         */

        // static method cannot be overridden because it doesnt depend on any object ,
        // so the method of reference type will be called and will not be overrided.
        Shape shape2 = new Square();
        // shape2.greeting();

    }
}

// final class Shape { If a class is declared as final , it cannot be inherited
// and it implicitly marks all its methods as final.
class Shape {
    // final void area() {
    // System.out.println("i am in shapes");
    // }
    // If I put this method as final , then it cannot be overridden.

    // public Shape() {
    // System.out.println("Shape Class");
    // }

    void area() {
        System.out.println("i am in shapes");
    }

    static void greeting() {
        System.out.println("Hello , I'm Shape Class Static Method");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("Area is side * side ");
    }

    static void greeting() {
        System.out.println("Hello , I'm Square Class Static Method");
    }
}

class Circle extends Shape {

    // public Circle() {
    // System.out.println("Circle Class");
    // }

    void area() {
        System.out.println("Area is PI * radius * radius");
    }
}

class Triangle extends Shape {
    void area() {
        System.out.println("Area is 0.5 * base * height");
    }
}