import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {

	public static void main(String[] args) throws IOException {

		String file = "texto.txt";

		// creating file
//		createFile(file);

		writeFile(file,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.\n\n It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

		readFile(file);

	}

	public static void readFile(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner reader = new Scanner(file);

		while(reader.hasNextLine()) {
			String data = reader.nextLine();
			System.out.println(data);
		}
	}

	public static void writeFile(String filename,String content) throws IOException {
		FileWriter file = new FileWriter(filename);
		file.write(content);
		file.close();
	}

	public static void createFile(String filename) throws IOException {
		File file = new File(filename);
		if(file.createNewFile()) {
			System.out.println("File created!");
		}else {
			System.out.println("File already exists.");
		}
	}

}
