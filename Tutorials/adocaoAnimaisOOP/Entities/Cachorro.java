package Entities;

public class Cachorro {
	
	private String nome;
	private int idade;
	
	public Cachorro(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", idade=" + idade + "]";
	}

}
