package Assignment1;

public class Question_37 {

	public static void main(String[] args) {
		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixB = { { 4, 5, 6 }, { 2, 7, 8 }, { 3, 1, 9 } };
		int row = 3;
		int column = 3;
		int[][] result = new int[row][column];
		System.out.println("Final Matrix is: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				result[i][j] = matrixA[i][j] + matrixB[i][j];
			}
			
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[i][j] + " ");

			}
			System.out.println();

		}
	}
}
