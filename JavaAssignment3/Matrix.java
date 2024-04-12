package JavaAssignment3;

import java.util.Scanner;

public class Matrix {
	private int rows;
	private int cols;
	private int[][] matrix;

	Scanner sc = new Scanner(System.in);

	public Matrix() {
		
	}

	public Matrix(int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
		this.matrix = new int[rows][cols];
	}

	public void getInfo() {
		System.out.println("Enter matrix element");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}

	public void getDisplay() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public Matrix add(Matrix matrix2) {
		Matrix result = new Matrix(this.rows, this.cols);
		if (this.rows == matrix2.rows && this.cols == matrix2.cols) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					result.matrix[i][j] = matrix2.matrix[i][j] + this.matrix[i][j];
				}
			}
			return result;
		} else {
			System.out.println("Matrices cannot be added.");
			return null;
		}

	}

	public static void main(String[] args) {
		
		Matrix matrix1 = new Matrix(2, 2);
		Matrix matrix2 = new Matrix(2, 2);

		System.out.println("Enter elements for first matrix:");
		matrix1.getInfo();
		System.out.println("First Matrix is:");
		matrix1.getDisplay();

		System.out.println("\nEnter elements for second matrix:");
		matrix2.getInfo();
		System.out.println("Second Matrix is:");
		matrix2.getDisplay();

		System.out.println("\nAdding matrices:");
		Matrix result = matrix1.add(matrix2);
		if (result != null) {
			System.out.println("Result Matrix is:");
			result.getDisplay();
		}

	}

}
