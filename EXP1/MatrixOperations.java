import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] A = new int[2][2];
            int[][] B = new int[2][2];
            int[][] result = new int[2][2];

            System.out.println("Enter elements of Matrix A:");
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++)
                    A[i][j] = sc.nextInt();

            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++)
                    B[i][j] = sc.nextInt();

            System.out.println("Choose operation: 1-Addition, 2-Multiplication, 3-Transpose of A");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    // Addition
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            result[i][j] = A[i][j] + B[i][j];
                    System.out.println("Result of Addition:");
                    printMatrix(result);
                }

                case 2 -> {
                    // Multiplication
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++) {
                            result[i][j] = 0;
                            for (int k = 0; k < 2; k++)
                                result[i][j] += A[i][k] * B[k][j];
                        }
                    System.out.println("Result of Multiplication:");
                    printMatrix(result);
                }

                case 3 -> {
                    // Transpose
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            result[i][j] = A[j][i];
                    System.out.println("Transpose of Matrix A:");
                    printMatrix(result);
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void printMatrix(int[][] M) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(M[i][j] + " ");
            System.out.println();
        }
    }
}
