package entities;

public class Emprestimo {
		private String nome;
		private Double valor;
		private Double juros;
		
		public Emprestimo(String nome, Double valor, Double juros) {
			this.nome = nome;
			this.valor = valor;
			this.juros = juros;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getValor() {
			return valor;
		}

		public void setValor(Double valor) {
			this.valor = valor;
		}

		public Double getJuros() {
			return juros;
		}

		public void setJuros(Double juros) {
			this.juros = juros;
		}

		@Override
		public String toString() {
			return "Emprestimo [nome=" + nome + ", valor=" + valor + ", juros=" + juros + "]";
		}
		
		
		
		
}
