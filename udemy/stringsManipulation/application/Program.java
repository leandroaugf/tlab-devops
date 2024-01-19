// teste das ferramentas, seção 10

package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		
		// lista array de strings
		List <String> myStringList = new ArrayList <String>();
		myStringList.add("Leandro"); myStringList.add("Maria"); 
		myStringList.add("Carla");	myStringList.add("João");
		myStringList.add("Marcão"); myStringList.add("Mariana");
		myStringList.add("Glenda"); myStringList.add("Graça");
		
		System.out.printf("OLD LIST:\n");
		for (String nomes : myStringList) {
			System.out.printf("%s\n", nomes);
		}
		myStringList.remove(1);		// remoção por posição --
		myStringList.remove("Carla"); // remoção por comparação --
		myStringList.removeIf(x -> x.charAt(0) == 'M'); // remoção por predicado, se começar com M;
		
		System.out.printf("\nNEW LIST:\n");
		for (String nomes : myStringList) {
			System.out.printf("%s\n", nomes);
		}
		
		System.out.printf("index of João: %d\n", myStringList.indexOf("João"));
		myStringList.add(0, "Leonardo"); myStringList.add(0, "Leozinho");
		
		System.out.printf("\nLista filtrada pela primeira letra = 'G': \n");
		// List<String> stringList = new ArrayList<String>(); ou
		List<String> stringList = myStringList.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
		for (String nomes : stringList) {
			System.out.printf("%s\n", nomes);
		}
		
		String nome = myStringList.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.printf("\nPrimeiro nome começado com a letra 'G' na lista: %s\n", nome);
		nome = myStringList.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);
		System.out.printf("Primeiro elemento começado com a letra 'Z' na lista: %s\n", nome);
	}
}