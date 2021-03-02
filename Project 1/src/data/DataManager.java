package data;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DataManager {
	DataManager(){}
	
	public void readFile(File f) {

		try {
			Scanner fileReader = new Scanner(f);
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		
		
	}
}
