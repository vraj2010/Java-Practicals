// Practical No. -- 2 (vii)
// Write a java program to perform addition and multiplication of Two Matrices.

import java.util.Scanner;
public class Prac2_vii
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the number of Rows : ");
        int rows = scanner.nextInt();
        
        System.out.print("\nEnter the number of Columns : ");
        int columns = scanner.nextInt();
        
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];
        int[][] productMatrix = new int[rows][columns];

        System.out.println("\nEnter the Elements of First Matrix : ");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nEnter the Elements of Second Matrix : ");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                productMatrix[i][j] = 0;
                for (int k = 0; k < columns; k++) 
                {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("\nSum of Matrices : ");
        printMatrix(sumMatrix);
        System.out.println("\nProduct of Matrices : ");
        printMatrix(productMatrix);
    }

    public static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int element : row) 
            {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}

