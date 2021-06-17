package workingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		readFile();

	}
	
	public static void createFile() {
		File file = new File("C:\\BtkJavaGiris\\files\\students.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("Dosya olu�turuldu");
			}else {
				System.out.println("Dosya zaten mevcut");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void getFileInfo() {
		File file = new File("C:\\BtkJavaGiris\\files\\students.txt");
		if (file.exists()) {
			System.out.println("Dosya ad� " + file.getName());
			System.out.println("Dosya yolu " + file.getAbsolutePath());
			System.out.println("Dosya yaz�labilir mi " + file.canWrite());
			System.out.println("Dosya okunabilir mi " + file.canRead());
			System.out.println("Dosya boyutu (byte) " + file.length());
		}
	}
	
	public static void readFile() {
		File file = new File("C:\\BtkJavaGiris\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
