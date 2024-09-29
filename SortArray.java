import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] Array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            Array[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(Array));
        Arrays.sort(Array);

        System.out.println("Sorted Array: " + Arrays.toString(Array));

        int sum = 0;
        for (int num : Array) {
            sum += num;
        }

        double average = (double) sum / n;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);

    }
}
