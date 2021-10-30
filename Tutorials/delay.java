package delay;

import java.util.concurrent.TimeUnit;

public class delay {
	
	public static void main(String[] args) {
		
		System.out.println("Carregando...");
		
		String start = "Olá mundo!";
		
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(start);
		
	}

}
