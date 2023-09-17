import java.util.Scanner;

public class Array2D {
    void matrixAddition(int m1, int m2, int n1, int n2, int[][] arr,int[][] arr2){
        // Addition of matrices
        int[][] arr3 = new int[m2][n2];
        System.out.println("Additon of the matrices");
        if (m1 == m2 && n2 == n1) {
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < n2; j++) {
                    arr3[i][j] = arr[i][j] + arr2[i][j];
                }

            }
            System.out.println("Printing the sum");
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < n2; j++) {

                    arr3[i][j] = arr[i][j] + arr2[i][j];
                    System.out.print(arr3[i][j] + "\t");
                }
                System.out.println("");

            }
        } else {
            System.out.println(" Rows and Columns do not match.");
        }
  }

  void matrixMultiply(int m1, int m2, int n1, int n2, int[][] arr,int[][] arr2){
    int[][] arr3 = new int[m2][n2];
    if (n1==m2) {
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = 0; j < n2; j++) {
              for (int k= 0; k < n1; k++) {
                  arr3[i][j] += arr[i][k] *arr2[k][j];
              }
            }
        }

        System.out.println("Printing the Product");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n2; j++) {

                
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println("");

        }
    }else{
        System.out.println("Not Possible");
    }
  }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input First Array M: and N: and then the values");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int[][] arr = new int[m1][n1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n1; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("Input Second Array");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] arr2 = new int[m2][n2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < n2; j++) {
                arr2[i][j] = sc.nextInt();

            }
        }

        // Printing the matrix
        System.out.println("Matrix 1");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n1; j++) {

                System.out.print(arr[i][j] + "\t");

            }
            System.out.println("");
        }
        System.out.println("\n");
        System.out.println("Matrix 2");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < n2; j++) {

                System.out.print(arr2[i][j] + "\t");

            }
            System.out.println("");
        }
       Array2D a2d = new Array2D();
    //    a2d.matrixAddition(m1, m2, n1, n2, arr, arr2);
       a2d.matrixMultiply(m1, m2, n1, n2, arr, arr2);
      

    }


}
