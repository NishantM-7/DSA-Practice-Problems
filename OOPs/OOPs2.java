import java.sql.Array;
import java.util.ArrayList;

public class OOPs2 {
    public static void main(String[] args) {
        StaticTest.statMethod();

        // static block display
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}

class StaticTest {
    public int age;
    public int salary;
    public String name;
    static int population;

    static void statMethod() {
        System.out.println("This is a static Method");
    }
}

class StaticBlock {
    // this is a demo to show initialisation of static variables.
    static int a = 4;
    static int b;
    // static block will only runn once , when the first object is created i.e. when
    // the class is loaded for the first time
    static {
        System.out.println("Inside static block");
        b = a * 5;
    }

}

// Inner Classes
// outside classes cannot be sTATIC because it itself is not dependent on any
// other class.
class InnerClasses {
    // But inner classes can be static ... because they depend on the outer class.
    static class Test {
        String name;
        // static String name;

        public Test(String name) {
            this.name = name;
            // Test.name = name;

        }

    }

    public static void main(String[] args) {
        Test a = new Test("Nishant");
        Test b = new Test("nick");
        // If we have declared the name variable as static , both a.name and b.name will
        // print "nick" as it is static so same variable will be renamed.
        // If we declare the class as static ,
        // the class is not dependent on the outer class but each instance of it has its
        // own unique identity, so a.name will print "Nishant" and b.name will print
        // "nick".

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

class Human {

    String message = "Hello World";

    public static void display(Human human) {
        System.out.println(human.message);
    }

    public static void main(String[] args) {
        Human kunal = new Human();
        kunal.message = "Kunal's message";
        Human.display(kunal);

    }

}