package core;

import java.io.File; // File Class
import java.io.FileNotFoundException;
import java.io.FileReader; // FileReader Class
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Iterator;
import java.net.URL;
import java.nio.file.Paths;

/**
 * This class consists of static methods to read files and folders, list files and folders, or encapsulate all the needed
 * functionalities for the engine to read and interpret the folders. All the methods will be static, because this class
 * is not intended to act like a object.
 * 
 * @author Softpretzel
 *
 */
public class Reader {
	
	/*
	 * This reads the file into an String ArrayList
	 */
	public static ArrayList<String> fileToString(File file) throws FileNotFoundException {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		FileReader fileReader = new FileReader(file);
		
		/*
		 * Need a little help of Scanner vs. Buffered reader, because I never know which one to use for what, though
		 * I think I'll use Scanner or the token based reader because that's the only one I know.
		 */
		Scanner tokenBasedReader = new Scanner(fileReader);
		
		while (tokenBasedReader.hasNextLine()) {
			arrayList.add(tokenBasedReader.nextLine());
		}
		
		tokenBasedReader.close();
		return arrayList;
		
	}
	
	public static ArrayList<String> fileToString(String file) throws FileNotFoundException {
		
		return fileToString(new File(file));
	
	}
	
	/*
	 * This method lists all the files in the folder
	 */
	public static ArrayList<String> listFolder(File folder) {
		
		ArrayList<String> fileList = new ArrayList<String>();
		
		for (final File fileEntry : folder.listFiles()) {
			if (!fileEntry.isDirectory()) {
				fileList.add(fileEntry.getName());
			}
		}
		
		return fileList;
		
	}
	
	public static ArrayList<String> listFolder(String folder) {
		
		return listFolder(new File(folder));
		
	}
	
}
