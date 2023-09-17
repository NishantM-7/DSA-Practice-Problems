public class RotationCount {
    public static void main(String[] args) {
        int[] arr = { 15, 7, 9, 11, 12 };
        System.out.println(rotationCount(arr));

    }

    static int rotationCount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        int mid;
        if (arr[end] > arr[start]) {
            return 0;
        }

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            } else if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;

    }
}
