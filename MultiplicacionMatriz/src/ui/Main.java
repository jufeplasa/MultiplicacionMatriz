package ui;
import model.*;
public class Main {
	
	private static SequentialMatrixMultiplication smm; 
	private static ThreadPoolMatrixMultiplication tmm; 
	private static RandomMatrixGenerator rmg; 
	
	public static void main(String[] arg) {
		smm = new SequentialMatrixMultiplication();
		tmm = new ThreadPoolMatrixMultiplication();
		rmg = new RandomMatrixGenerator();
		
		int [][] matrizA= rmg.generateRandomMatrix(2, 2);
		int [][] matrizB= rmg.generateRandomMatrix(2, 2);
		smm.multiply(matrizA, matrizB);
		int [][] matrizR=smm.getResult();
		
		
	}
	
	public void showMatriz(int [][] matriz) {
		
		
	}
}
