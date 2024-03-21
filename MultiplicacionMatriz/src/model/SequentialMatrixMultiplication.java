package model;

public class SequentialMatrixMultiplication {
	
	private int[][] result;
	
	public SequentialMatrixMultiplication() {
		
	
	}
	
	public void multiply(int[][] matrixA,int[][] matrixB) {
		result = new int[matrixA.length][matrixB[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j]=multiRowColumn(matrixA,matrixB, i,j);
			}
		}
		
	}
	
	private int multiRowColumn(int[][] matrixA,int[][] matrixB, int row, int column) {
		int a =0;
		for (int i = 0; i < matrixB.length; i++) {
			a+=matrixA[row][i]*matrixB[i][column];
		}
		return a;
	}
	

	public int[][] getResult() {
		return result;
	}

	public void setResult(int[][] result) {
		this.result = result;
	}
}
