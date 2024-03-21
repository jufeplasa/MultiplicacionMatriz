package model;
import java.util.Random;
public class RandomMatrixGenerator {
	
	public RandomMatrixGenerator() {
		
	}
	
	public int[][] generateRandomMatrix(int rows, int columns){ 
	
	 int[][] matrix = new int[rows][columns];
	 Random random = new Random();
	 for (int i = 0; i < rows; i++) {
		 for (int j = 0; j < columns; j++) {
			 //Números aleatorios entre 0 y 99
			 matrix[i][j] = random.nextInt(100); 
		 }
	 }
	 return matrix;
	 }
}
