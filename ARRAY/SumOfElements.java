import java.util.Scanner;
public class SumOfElements{
public static void main(String[] args) {
    int len;
    Scanner sc = new Scanner(System.in);
    len = sc.nextInt();

    int[] arr = new int[len];
    System.out.println("Enter Array elements");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();

    }
    //Sum of elements in the array 
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
    sum += arr[i];


}

System.out.println("Sum of the elements in the array: "+sum);

// Searching the element in the array
System.out.println("Enter the element you like to search:");

int num = sc.nextInt();
boolean isFound = false;
for (int i = 0; i < arr.length; i++) {
    if(arr[i] == num){
        System.out.println("Element is found at index "+i);
        isFound = true;
    }else{
        continue;
    }
}
if(isFound == false){
    System.out.println("Item not found");
}

//Finding the maximum element and second maximum element in the array
System.out.println("Finding the maximum element in the array :");

int max = arr[0];
int secondMax = arr[0];
for (int i = 0; i < arr.length; i++) {
    if(arr[i] > max){
        secondMax = max;
        max = arr[i];

    }else if(arr[i] > secondMax){
        secondMax = arr[i];
    }
    else {
        continue;
    }
  
}

System.out.println("Max number in the array : " + max);

System.out.println("SecondMax : "+ secondMax);


}
}