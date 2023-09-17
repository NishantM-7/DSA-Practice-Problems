import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(selectionSort(array)));

    }

    static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }

        return arr;

    }

    private static void swap(int[] arr, int maxIndex, int last) {

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {

        int max = start;
        for (int i = 0; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
