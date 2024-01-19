// Estrutura de um programa que filtra o ID de um objeto funcionário;
// O programa visa o contato com o uso de getters, setters, construtores, arrayList e filter;

// NOTA -> função "get" acessa o vetor na posição especificada // sintaxe -> 'vector.get(i).' ..

package atividade;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

import auxAtividade.Employees;

public class Aplicativo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter how many employees will be registered: ");
		int numberEmployees = scanner.nextInt();
		List<Employees> employees = new ArrayList<Employees>();
		
		// LEITURA DOS FUNCIONÁRIOS
		// myEmployee.setId(scanner.nextInt());
		int idTemp; String nameTemp; double salaryTemp;
		
		for (int i = 0; i < numberEmployees; i++) {
			System.out.printf("\nEmployee #%d:\n", i + 1);
			System.out.printf("ID: "); idTemp = scanner.nextInt();
			System.out.printf("Name: "); scanner.nextLine(); nameTemp = scanner.nextLine(); 
			System.out.printf("Salary: "); salaryTemp = scanner.nextDouble();
			
			Employees myEmployee = new Employees(idTemp, nameTemp, salaryTemp);
			employees.add(myEmployee);
		}
		
		System.out.printf("\nEnter the employee ID thats gonna have salary increased: ");
		int newId = scanner.nextInt();
		// MAIN FUNCTION -> line below
		Employees greatEmployee = employees.stream().filter(x -> x.getId() == newId).findFirst().orElse(null);
		
		if (greatEmployee == null) {
			System.out.printf("This user ID doesn't exist!");
		} else {
			System.out.printf("Enter the percentage: ");
			salaryTemp = scanner.nextDouble();
			greatEmployee.salaryAdjustment(salaryTemp);
	
			System.out.printf("\nList of employees:\n");
			for (Employees e : employees) {
				System.out.printf("%d, %s, %.2f\n", e.getId(), e.getName(), e.getSalary());
			}
		}
		
		scanner.close();
	}
	
	// SOLUÇÃO DO PROFESSOR EM LIVE:
	/*
	public static Integer idPosition(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			} else {
				return null;
			}
		}
	}
	*/
}