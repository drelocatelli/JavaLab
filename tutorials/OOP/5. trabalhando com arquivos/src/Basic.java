import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

import Config.*;

public class Basic extends SourcePath{

	public static void main(String[] args) {
		path += "arquivo.txt";
		
		File file = new File(path);
		Scanner input = null;
		
		try {
			input = new Scanner(file);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			
		}catch(IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		
	}

}
