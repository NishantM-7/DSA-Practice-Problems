import java.util.Scanner;

public class JavaTest {
    public static void main(String[] args) {
        int key;
        int input1, input2, input3;
        int digit1, digit2, digit3;
        int largeKey1 = 0, largeKey2 = 0, largeKey3 = 0;
        int smallestKey1 = 9, smallestKey2 = 9, smallestKey3 = 9;
        Scanner sc = new Scanner(System.in);
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        input3 = sc.nextInt();

        for (int j = 0; j < 4; j++) {
            digit1 = input1 % 10;
            digit2 = input2 % 10;
            digit3 = input3 % 10;
            if (digit1 > largeKey1) {
                largeKey1 = digit1;
            }
            if (digit2 > largeKey2) {
                largeKey2 = digit2;
            }
            if (digit3 > largeKey3) {
                largeKey3 = digit3;
            }
            if (digit1 < smallestKey1) {
                smallestKey1 = digit1;
            }
            if (digit2 < smallestKey2) {
                smallestKey2 = digit2;
            }
            if (digit3 < smallestKey3) {
                smallestKey3 = digit3;
            }
            input1 = input1 / 10;
            input2 = input2 / 10;
            input3 = input3 / 10;

        }

        key = largeKey1 + largeKey2 + largeKey3 + smallestKey1 + smallestKey2 + smallestKey3;
        System.out.println(key);

    }
}