
public class GenericsExample {
    public static void main(String[] args) {
        CustomArray<String> list = new CustomArray<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.size();
        // list1.add(0, 90);
        // list1.remove(list1.get(0));
        // list1.get(0);
        // list1.set(0, 67);
        // list1.isEmpty();
        list.add("NISHANT");
        list.add("kUMAR");
        list.add("MISHRA");
        System.out.println(list);

        CustomArray<Integer> list2 = new CustomArray<>();
        list2.add(89);
        // list2.add("OP"); //The method add(Integer) in the type CustomArray<Integer>
        // is not applicable for the arguments (String)
        System.out.println(list2.get(0));
        System.out.println(list2);

    }
}

// Upper Bounded WildCards
/*
 * You can use an upper bounded wildcard to relax thee restrictions on a
 * variable.
 * For e.g., Say vyou want to write a method that works on List<Integer> ,
 * List<Double> , and
 * List<Number>; you can achieve tyhis by using an upper bounded wildcard.
 * e.g. public static void process(List<? extends Number> list){//code} or
 * public static void process(List<? extends Foo> list){}, where Foo is any
 * type,matches Foo and any subtype of Foo
 * here above we have Number class, it will accept Number class as well as any
 * subtype such as Integer class or Double class.
 */