package entities;

public class Pessoas {
	private int idade;
	private String nome;
	private double altura;
	
	public Pessoas(int idade, String nome, double altura) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
