import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Config.SourcePath;

public class Writer extends SourcePath {
	
	public static void main(String[] args) {
		path += "editfile.txt";
		
		String[] lines = {"Olá mundo", "Tudo bem contigo?", "Good night"};
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
				
				// imprime o que foi escrito
				System.out.println(line);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
