package visualNovel.core;

/**
 * 
 * This class is the active user of the Program, storing information basic information on the
 * user such as their ID and Username. However, this also serves other functions such as settings,
 * because I think that settings is tied to personal preferences to the user. These settings, 
 * however, aren't the same as the novel settings, which are tied to the creator of the novels.
 * <p>
 * Random Note for Later: If you manage to get this on Steam, then hopefully you make the accounts
 * imported into some kind of cloud.
 * 
 * @author Soft Potato
 *
 */
public class User {
	
	/**
	 * This is basically the comment thing, but this is more of a personal notification or updates
	 * in the program for your book. You'll usually receive automated updates from the server.
	 * Hm... Should I implement this into the program?!?!?! Not much of a point and I think it's
	 * pointless, but meh...
	 * 
	 * @author Soft Potato
	 *
	 */
	private class Mail{
		
	}
	
	// Basic User Information
	private String id;			// The unique id reserved for each new user account
	private String username;	// The name of the user, not reserved per account
	private boolean ageLimit;	// Determines if swear/cuss words are censored or not
	private String[] bookmarks;	// This will make accessing bookmarked novels easier to find, so
								// this will send the server the book ID, and yeah. 
	// TODO: figure out stb and implement images profile images here
	
	// System Settings
	private int width;			// Window's width
	private int height;			// Window's height
	private boolean vsync;		// A setting that lowers the FPS to make outperforming comupters
								// to cut back and make the game consistent across machines
	private boolean phone;		// A setting to tell if the monitor's height is greater than width
	
	
	
}
