package entities;

public class Filme {
		
		private Integer cod;
		private String  titulo;
		private char    genero;
		
		public Filme(Integer cod, String titulo, char genero) {

			this.cod = cod;
			this.titulo = titulo;
			this.genero = genero;
		}

		public Integer getCod() {
			return cod;
		}

		public void setCod(Integer cod) {
			this.cod = cod;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public char getGenero() {
			return genero;
		}

		public void setGenero(char genero) {
			this.genero = genero;
		}

		@Override
		public String toString() {
			return "Filme [cod=" + cod + ", titulo=" + titulo + ", genero=" + genero + "]";
		}
		
		
		
		
}
