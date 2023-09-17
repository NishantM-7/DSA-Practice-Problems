
import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(nums).toString());
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        List<Integer> newList = new ArrayList();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != (j + 1)) {
                newList.add(j + 1);
            }
        }
        return newList;

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}