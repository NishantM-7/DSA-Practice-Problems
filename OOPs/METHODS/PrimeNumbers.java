import java.util.Scanner;

public class PrimeNumbers {
    // Finding whether number is Prime
    boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Finding GCD of two numbers
    // METHOD1
    // int findGCD(int num1, int num2){
    // int gcd =1;
    // if(num1<num2){
    // for (int i = 2; i <= num1; i++) {
    // if (num1%i == 0 && num2%i == 0) {
    // gcd = i;
    // }
    // }
    // }else{
    // for (int i = 2; i <= num2; i++) {
    // if (num1%i == 0 && num2%i == 0) {
    // gcd = i;
    // }
    // }
    // }
    // return gcd;
    // }
    // METHOD2
    int findGCD(int num1, int num2) {
        while (true) {
            if (num1 == num2) {
                return num1;
            } else if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        PrimeNumbers iP = new PrimeNumbers();

        System.out.println("Is Prime: " + iP.isPrime(num));
        System.out.println("GCD: " + iP.findGCD(num, num2));

    }
}
