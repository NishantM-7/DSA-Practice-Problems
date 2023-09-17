// Finding the element which is either equal to or next greater than the target.( Finding the ceiling value)
public class CeilingProblem {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(ceilingValue(arr, 4));
        System.out.println(floorValue(arr, 4));
    }

    static int ceilingValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // returns -1 if all the numbers in the array are smaller than the target
        // element
        // since no greater element can be found in this case.
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return arr[mid];
            }
        }

        return arr[start];

    }

    static int floorValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        // returns -1 if all the numbers in the array are greater than the target
        // element
        // since no smaller element can be found in this case.
        if (target < arr[0]) {
            return -1;
        }

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
