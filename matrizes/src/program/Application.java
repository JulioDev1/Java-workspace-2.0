package program;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for (int i = 0 ; i <mat[i].length ; i++) {
			for(int j = 0 ; j<mat.length ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("position :");
		int x = sc.nextInt();
		for (int i = 0 ; i <mat[i].length ; i++) {
			for(int j = 0 ; j<mat.length ; j++) {
				if(mat[i][j] == x) {
					System.out.println("position"  + i + "," + j + ":");
					if(j>0) {
						System.out.println("left"+mat[i][j]);
					}
					if(i>0) {
						System.out.println("up"+mat[i][j]);
					}
					if(j < mat[i].length-1) {
						System.out.println("right"+mat[i][j]);
					}
					if(i < mat.length-1) {
						System.out.println("down"+mat[i][j]);
					}
			}
		}
	}
		sc.close();
	}
}
		

	


