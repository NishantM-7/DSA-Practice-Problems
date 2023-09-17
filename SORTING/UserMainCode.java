public class UserMainCode {
    public static void main(String[] args) {
        System.out.println(findSumOfPrimes(new int[] { 10, 20, 30, 40 }, 4));
    }

    static int findSumOfPrimes(int[] input1, int input2) {
        int sum = 0;
        int primeMin = Integer.MAX_VALUE;
        boolean flag;
        for (int i = 0; i < input1.length; i++) {
            flag = true;
            for (int j = 2; j <= input1[i] / 2; j++) {
                if (input1[i] % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                sum += input1[i];
            }

            if (flag == true && input1[i] < primeMin) {
                primeMin = input1[i];

            }

        }
        if (sum - primeMin < 0) {
            sum = 0;
        } else {

            sum = sum - primeMin;
        }

        System.out.println(sum);
        if (sum == 0) {
            int nonPrimeMin = arrayMin(input1);
            for (int i = 0; i < input1.length; i++) {
                if (input1[i] == nonPrimeMin) {
                    continue;
                } else {
                    sum += input1[i];

                }
            }

        }

        return sum;
    }

    static int arrayMin(int[] input1) {
        int min = input1[0];
        for (int i = 1; i < input1.length; i++) {
            if (input1[i] < min) {
                min = input1[i];
            }
        }
        return min;
    }
}
