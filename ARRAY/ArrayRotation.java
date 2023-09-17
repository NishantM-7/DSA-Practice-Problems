import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of array: ");
        int len = sc.nextInt();
        System.out.println("Take an input array: ");
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + "\t");

        }
        int[] arr2= arr.clone();
        System.out.print("\nPrinting Array after left rotation: ");
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[len-1] = temp;
        for (int i : arr) {
            System.out.print("\t" + i);
        }
        System.out.print("\nPrinting Array after right rotation: ");
       
        int temp2 = arr2[len-1];
        for (int i = len-2; i >=0; i--) {
            arr2[i+1] = arr2[i];
        }
        arr2[0] = temp2;
        for (int i : arr2) {
            System.out.print("\t" + i);
        }

    }
}