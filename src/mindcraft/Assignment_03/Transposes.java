package mindcraft.Assignment_03;
import java.util.Scanner;
public class Transposes {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[][] matrix1 = new int[3][3];
            int[][] matrix2 = new int[3][3];
            int[][] transpose = new int[3][3];
            int[][] addition = new int[3][3];

            // Accept first matrix
            System.out.println("Enter elements of first 3x3 matrix:");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }

            // Display first matrix using enhanced for loop
            System.out.println("First Matrix:");

            for (int[] row : matrix1) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }

            // Find transpose
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    transpose[j][i] = matrix1[i][j];
                }
            }

            // Display transpose
            System.out.println("Transpose of Matrix:");

            for (int[] row : transpose) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }

            // Accept second matrix
            System.out.println("Enter elements of second 3x3 matrix:");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }

            // Addition
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    addition[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println(" Addition of Two Matrices:");

            for (int[] row : addition) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }
