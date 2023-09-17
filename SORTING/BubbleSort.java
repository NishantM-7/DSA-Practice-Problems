import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 3, 5, 4, 1, 2 };

        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    static int[] bubbleSort(int[] arr) {
        boolean swapped;

        // Loop for number of passes .(n-1) times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // Loop for comparisons between the elements
            for (int j = 1; j < arr.length - i; j++) {
                // Condition for swapping
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                // If swapped == false , !swapped = true, so the if no swapping is done then
                // array is sorted.
                // Hence break the loop
                break;
            }
        }

        return arr;
    }
}
