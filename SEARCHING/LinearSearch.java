
import java.util.*;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Input length of Array");
        // int len;
        // len = sc.nextInt();
        // int[] arr = new int[len];
        // System.out.println("Input Array");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the element to find");
        // int target = sc.nextInt();

        // System.out.println("Element index: " + Linearsearch(arr, target));

        String name = "Nishant";
        System.out.println(stringSearch(name, 'a'));
        System.out.println(Math.log10(100));

    }

    static int Linearsearch(int[] arr, int target) {
        // if array length is 0 , return -1
        if (arr.length == 0) {
            return -1;

        }

        // Traverse the array to find the index of the element.
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // If not found return -1;
        return -1;

    }

    static boolean stringSearch(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }

        return false;

    }
}
