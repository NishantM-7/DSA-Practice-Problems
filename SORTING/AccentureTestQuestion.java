/*
 * 'A' and 'B' start from a same point on a circular track. 'A' starts moving at M second 
 * and takes X secs to complete one rotation,
 * while 'B' starts moving at N second and takes Y seconds to complete the track.
 * Find the time at which they will meet again at the starting point.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AccentureTestQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input for A
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        // Taking input for B
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        while (true) {

            if (set.contains(input3)) {
                System.out.println(input3);
                break;
            } else if (set.contains(input1)) {
                System.out.println(input1);
                break;
            } else {

                set.add(input1);
                set.add(input3);
                input1 = input1 + input2;
                input3 = input3 + input4;
            }
        }

    }
}
