import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {
                10, 90, 60, 55, 91, 100, 7, 87, 56, 43, 31
        };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 43));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start + end) / 2;
            // In this approach of calculating mid, the sum of start and end values may
            // exceed the range of int,
            // So , a better approach would be
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
