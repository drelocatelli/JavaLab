package entities;

public class Vendedor {
		
		private Integer cod;
		private String  nome;
		private char mercadoria;
		
		public Vendedor(Integer cod, String nome, char mercadoria) {

			this.cod = cod;
			this.nome = nome;
			this.mercadoria = mercadoria;
		}

		public Integer getCod() {
			return cod;
		}

		public void setCod(Integer cod) {
			this.cod = cod;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public char getMercadoria() {
			return mercadoria;
		}

		public void setMercadoria(char mercadoria) {
			this.mercadoria = mercadoria;
		}

		@Override
		public String toString() {
			return "Vendedor [cod=" + cod + ", nome=" + nome + ", mercadoria=" + mercadoria + "]";
		}
		
}
