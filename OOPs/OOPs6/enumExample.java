public class enumExample {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // these are eum constants
        // public, static and final
        // since its final you can not create child enums
        // type is Week
    }

    public static void main(String[] args) {
        Week week = Week.Monday;
        for (Week day : Week.values()) {
            System.out.println(day);
        }

    }
}
