
// FINDING LARGEST AND LEAST ELEMENT IN AN ARRAY.
import java.util.Arrays;
import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];

        // ARRAY INPUT
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // PRINTING ARRAY
        for (int i : arr) {

            System.out.print(i + "\t");

        }
        System.out.println();
        // FINDING LARGEST ELEMENT
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("MAX:  " + max);
        // FINDING LEAST ELEMENT
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("MIN: " + min);

    }
}
