package visualNovel.core;

import java.util.ArrayList;

/**
 * This is the basic class to all the books in the program. It will contain all the pages or
 * scenes, images/sprites, soundtracks and FX, and generally anything you can think of as part
 * of the book
 * 
 * <p>
 * 
 * The Novel has 2 states, downloaded and not downloaded.
 * 
 * @author Soft Potato
 *
 */
public class Novel {
	private String id;						// Unique identifier identifying novel number
	private String[] name;					// Name of novel
	private String[] description;				// Description of book
	private String[] author;					// Author name or username
	private ArrayList<Chapter> chapters;	// An ArrayList of the chapters
	
	
	
	/**
	 * This method returns if the novel presented is downloaded
	 * 
	 * @return
	 */
	public boolean downloaded() {
		return chapters == null;
	}
	
	
}
