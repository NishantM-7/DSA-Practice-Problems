import java.util.Arrays;

import New.Test;

public class OOPs4 extends Test {
    // protected int mynum = 10;

    public static void main(String[] args) {
        OOPs4 obj = new OOPs4();
        int number = obj.num;

        // obj.num can only be accessed in different package if and only if
        /*
         * Class inherits the super class and the reference type and object type must be
         * of the child class.
         * Test obj = new OOPs4();
         * obj.num // will throw ar error that memeber not visible
         * Test obj = new Test();
         * obj.num // this also cannot be done to access protected member in different
         * package.
         */

    }
}

// class TestHere extends OOPs4 {
// public static void main(String[] args) {
// OOPs4 obj = new TestHere();
// obj.mynum = 20;
// }
// }
