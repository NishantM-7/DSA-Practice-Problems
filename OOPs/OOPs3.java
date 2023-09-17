public class OOPs3 {
    // Inheritance

    public static void main(String[] args) {
        // Box box = new Box();
        // System.out.println(box.l + " " + box.h + " " + box.w);
        /*
         * 
         * 
         */
        // Box box5 = new BoxWeight(10, 20, 10, 20);
        // System.out.println(box5.h);
        // // System.out.println(box5.weight);
        /*
         * box5.weight cannot be accessed because the type of reference variable decides
         * which members can be accessed.
         * Here reference variable is of type Box but object is of BoxWeight();
         */

        //
        //
        BoxPrice price = new BoxPrice(20, 19, 25);
        System.out.println(price.cost);

    }
}

class Box {
    double l;
    // private double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
        System.out.println("Default Box Class constructor called !");
    }

    Box(double side) {
        this.w = side;
        this.h = side;
        this.l = side;
        System.out.println("Box Class constructor called !");
    }

    Box(double l, double h, double w) {
        this.w = w;
        this.h = h;
        this.l = l;
    }

    Box(Box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void dusplayInfo() {
        System.out.println("Running the Box Class Method");
    }
}

class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        System.out.println("Default BoxWeight Class constructor called !");

        this.weight = -1;
        // this.l = -1;
        /*
         * if l was private you couldn't have accessed it here because
         * private is only available to the class it is declared in .
         */
    }

    public BoxWeight(double side, double weight) {
        // super(side);
        System.out.println("BoxWeight Class constructor called !");
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this ? call to the parent class constructor
        // used to initialize values present in the parent class.
        this.weight = weight;
    }
}

class BoxPrice extends BoxWeight {
    public double cost;

    public BoxPrice() {
        this.cost = -1;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
        System.out.println("BoxPrice Class constructor called !");
    }
}