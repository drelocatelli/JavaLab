package entities;

public class Alunos {
		
	private Integer matricula;
	private String nome;
	private Double nota1;
	private Double nota2;
		
	
	
	public Alunos() {
		
	}


	public Alunos(Integer matricula, String nome, Double nota1, Double nota2) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}


	public Integer getMatricula() {
		return matricula;
	}


	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getNota1() {
		return nota1;
	}


	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}


	public Double getNota2() {
		return nota2;
	}


	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}


	@Override
	public String toString() {
		return "Alunos [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}
	
	
	
	
}
