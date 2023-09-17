import java.util.Scanner;

public class InsertionDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr= new int[len];
        for (int i = 0; i < arr.length - 3; i++) {
            arr[i] = sc.nextInt(); 
        }
        for (int i : arr) {
            System.out.print(i+ "\t");
        }
        System.out.println("Enter the number you would like to insert: ");
        int num = sc.nextInt();
        System.out.println("Select an index to insert: ");
        int index = sc.nextInt();

        for (int i = len -2; i >=0 ; i--) {
             
            if (i >= index ) {
                arr[i+1] = arr[i];
            }
        }
        arr[index] = num;
        System.out.println("Resulting Array is:");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println("Select the index you want to delete: ");
        int delIndex = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (i > delIndex) {
                arr[i-1] = arr[i];
            }
        }
        System.out.println("Resulting array is : ");
        for (int i : arr) {
            System.out.print(i+ "\t");
        }

    }
}
