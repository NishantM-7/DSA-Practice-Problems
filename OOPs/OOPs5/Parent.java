public abstract class Parent {
    // creating normal methods in abstract classes is also allowed
    void greeting() {
        System.out.println("Hey , Nishant here !");
    }

    // creating static methods is also allowed but you cannot mark it as abstract.
    // static methods cannot be overridden so marking it abstract is pointless;
    static void parentStaticMethod() {
        System.out.println("This is a static method in the abstract parent class.");
    }

    int age;
    // constructors can also be made in abstract classes but they cannot be marked
    // as abstract

    public Parent(int age) {
        this.age = age;

    }

    public Parent() {
        System.out.println("Parent Class Constructor.");
    }

    abstract void career();

    abstract void partner();
}