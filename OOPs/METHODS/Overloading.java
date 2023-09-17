import java.util.Scanner;

public class Overloading {
    // Reverse method for a number.
    int reverseInput(int n){
        int temp = 0;
        while (n>0) {
            temp = temp*10 + n %10;
            n = n/10;
        }
        return temp;
       
    }
    // Overloaded reverse ethod for an array.
    int[] reverseInput(int arr[]){
        int []arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - i-1];
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The reversed number is: ");
        Overloading ov = new Overloading();
        System.out.println(ov.reverseInput(num));
        System.out.println("Enter Your Array Length and Array: ");
        int len = sc.nextInt();
        int []arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nReversed Array is:");
        arr = ov.reverseInput(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }


    }
}
