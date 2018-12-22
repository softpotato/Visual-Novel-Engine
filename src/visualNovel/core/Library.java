package visualNovel.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * This class encalsulates the larger functions of the 
 * 
 * @author Softp
 *
 */
public class Library {
	
	// Decided to use ArrayList for their faster getter and setter methods, also modifying it
	// is less common or structure of it is not as important it helps to be dynamic.
	// This variable should have not have null values in a place when you want to load the books,
	// though I think that I should load books that you want to read in the moment and remove
	// also deletes the books as well in the file system. This will be initialized everytime
	// this class is created and will store the books in the documents folder of the user.
	// TODO: remember how to use the Java System.getProperty("user") or something to find the
	// documents files.
	private ArrayList<Novel> downloadedNovels;
	
	/**
	 * Note: I forget, but I think that it was FileInputStream that I wanted. It think it was
	 * because so you have to close it and I don't have to deal with it at the moment with the
	 * throw exceptions and stuff.
	 * 
	 * @param input
	 */
	public Library(FileInputStream input) {
		
	}
	
	// or was it this?
	public Library(File root) {
		
	}
	
}
