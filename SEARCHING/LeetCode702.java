// Finding an element in an infinite sorted array .(using Binary Search )
public class LeetCode702 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30 };
        int start = 0;
        int end = 1;
        int target = 4;
        while (target > nums[end]) {
            int sizeOfBox = end - start + 1;
            start = end + 1;
            end = end + sizeOfBox * 2;

        }
        System.out.println("Found at index : " + searchInInfiniteSortedArray(nums, target, start, end));

    }

    static int searchInInfiniteSortedArray(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
