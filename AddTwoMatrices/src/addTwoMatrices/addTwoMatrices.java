package addTwoMatrices;

public class addTwoMatrices {
	public static void main(String[] args) {
		int rows = 2, columns = 3;
		int[][] firstMatrix = { {1, 3, 4}, {3, 4, 5} };
		int[][] secondMatrix = { {1, 3, 4}, {3, 4, 5} };
		
		// Penjumlahan Dua Matriks
		int[][] sum = new int[rows][columns];
		for(int i = 0; i < rows; i++) {
		    for (int j = 0; j < columns; j++) {
		        sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
		    }
		}
		
		// Hasil
		System.out.println("Jumlah dari dua matriks: ");
		for(int[] row : sum) {
		    for (int column : row) {
		        System.out.print(column + "    ");
		    }
		    System.out.println();
		}
	}
}
