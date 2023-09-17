
// MOVE ZEROES TO THE END.
/*Given an integer array nums, move all 0's to the end of it 
while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array
*/
import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(moveZeros(n, arr)));

    }

    static int[] moveZeros(int n, int[] a) {
        // Write your code here.
        int j = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return a;
        }

        for (int i = j + 1; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        return a;
    }
}
