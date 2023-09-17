import java.util.Arrays;
import java.util.Comparator;

public class ComparisonObjects {
    public static void main(String[] args) {
        Student nishant = new Student(1, 95.3f);
        Student nick = new Student(2, 98.7f);
        Student student3 = new Student(3, 93.7f);
        Student student4 = new Student(9, 99.9f);
        Student student5 = new Student(4, 94.4f);

        // if((nishant - nick) < 0){
        /*
         * In this case the jvm gets confused which member to compare since it has roll
         * no and marks both
         * So we implement Comparable interface and define compareTo method so that it
         * could compare Objects based on the function
         */
        if (nishant.compareTo(nick) < 0) {
            System.out.println("Nick has more marks than Nishant");
        }

        Student[] list = { nishant, nick, student3, student4, student5 };

        // if i want to sort the list of these student
        // if i havent used compareTo method it would have got confused and thrown an
        // exception.
        // Since we have compareTo defined , it will use that to sort the list

        Arrays.sort(list);

        // We can also define Comparator compare method inside sort method.
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return (int) (o1.marks - o2.marks);

            }
        });

    }
}

// Done with the help of interface Comparable<T>
// Comparable takes a parameter T (Generic)
// Here , we want to compare Student with Student so we take T as Student

class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;

    }

    @Override
    public String toString() {

        return "Roll: " + this.rollno + "  Marks: " + this.marks;
    }

    @Override
    public int compareTo(Student o) {
        // Override the compareTo method here
        return (int) (this.marks - o.marks);

        // Compares marks of student with other student
    }
}