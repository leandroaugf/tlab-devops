package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exe1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o valor de n: ");
		int count = 0;
		int n = scanner.nextInt();
		int[][] matriz = new int[n][n];
		
		System.out.printf("Preencha a matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = scanner.nextInt();
				if (matriz[i][j] < 0) count++;
			}
		}
		System.out.printf("\nValores da matriz diagonal:\n");
		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("%d ", matriz[i][i]);
		}
		System.out.printf("\nNúmero de valores negativos: %d", count);
		
		scanner.close();
	}
}