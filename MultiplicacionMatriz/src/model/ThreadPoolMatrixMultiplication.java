package model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolMatrixMultiplication {
	
	public static void multiply(int[][] matrixA, int[][] matrixB, int numThreads) {
		ExecutorService executor = Executors.newFixedThreadPool(numThreads);
		
		int rowsA = matrixA.length;
		int columnsA = matrixA[0].length;
		int columnsB = matrixB[0].length;
		
		int [][] result = new int[rowsA][columnsB];
		
		for(int i=0;i<rowsA;i++) {
			int row = i;
			executor.submit(new Runnable() {
				@Override
				public void run() {
					for(int j=0;j<columnsB;j++) {
						for(int k=0;k<columnsA;k++) {
							result[row][j] += matrixA[row][k] * matrixB[k][j];
						}
					}
				}
			});
			
		}
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
