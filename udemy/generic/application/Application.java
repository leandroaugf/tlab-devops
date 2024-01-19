package application;

import entities.Pessoas;
import java.util.Locale;
import java.util.Scanner;


public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner myScanner = new Scanner(System.in);
		
		System.out.printf("Digite o número de pessoas: ");
		int numeroPessoas = myScanner.nextInt();
		Pessoas[] pessoas = new Pessoas[numeroPessoas];
		
		int idadeTemp; double alturaTemp; String nomeTemp;
		
		for (int i = 0; i < pessoas.length; i++) {
			myScanner.nextLine();
			System.out.printf("Digite o nome da pessoa %d: ", i + 1);
			nomeTemp = myScanner.nextLine();
			System.out.printf("Digite a idade da pessoa %d: ", i + 1);
			idadeTemp = myScanner.nextInt();
			System.out.printf("Digite a altura da pessoa %d: ", i + 1);
			alturaTemp = myScanner.nextDouble();
			System.out.println();
			
			pessoas[i] = new Pessoas(idadeTemp, nomeTemp, alturaTemp);
		}

		int menores = 0;
		double mediaAltura = 0;
		
		for (int i = 0; i < pessoas.length; i++) {
			mediaAltura += pessoas[i].getAltura();
			if (pessoas[i].getIdade() < 16) {
				menores++;
			}
		}
		
		System.out.printf("Média das alturas: %.2f\n", mediaAltura /= pessoas.length);
		System.out.printf("Pessoas menores de 16: %d", menores);
		
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				System.out.printf("\n%s", pessoas[i].getNome());
			}
		}
			
		myScanner.close();
	}
}
