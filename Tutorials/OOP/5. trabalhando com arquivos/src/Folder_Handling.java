import java.io.File;
import java.util.Scanner;

import Config.SourcePath;

public class Folder_Handling extends SourcePath{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// lista pasta

		System.out.println(path);

		File f = new File(path);

		File[] folders = f.listFiles(File::isDirectory);

		try {
			if(folders.length > 0) {
				System.out.println("FOLDERS: ");
				for(File folder : folders) {
					System.out.println(folder);
				}
			}else if(folders.length == 0) {
				System.out.println("Nenhuma pasta foi encontrada.");
			}
		}catch(Exception e) {
			System.out.println("Ocorreu um erro: "+e.getMessage());
		}

		// lista arquivos

		File[] files = f.listFiles(File::isFile);
		
		try {
			if(files.length > 0) {
				System.out.println("FILES: ");
				for(File file : files) {
					System.out.println(file);
				}
			}else if(files.length == 0) {
				System.out.println("Nenhum arquivo foi encontrado.");
			}
		}catch(Exception e) {
			System.out.println("Ocorreu um erro: "+e.getMessage());
		}
		
		// cria pasta
		
//		new File(path+"/subdir").mkdir();


	}

}
