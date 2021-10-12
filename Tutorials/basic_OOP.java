import java.util.Scanner;

class Cachorro {
	
	public int id;
	public String nome;
	
	public Cachorro(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Cachorro [id="+id+", nome=" + nome + "]";
	}

}



public class Main {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// input
		int quantity = 3;
		
		// conjunto
		Cachorro[] myCachorros = new Cachorro[quantity];
		
		for(int i = 0; i < quantity; i++) {
			System.out.println("Nome do cachorro "+ (i+1) + ":");
			myCachorros[i] = new Cachorro(i, input.nextLine());
		}
		
		// imprime variaveis
		for(int i = 0; i < quantity; i++) {
			System.out.print("Nome do cachorro "+ (i+1) + ": ");
			System.out.println(myCachorros[i]);
		}
		
	}
	
}
