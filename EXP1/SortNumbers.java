import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[10];

            System.out.println("Enter 10 numbers:");
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.println("Sorted numbers:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
