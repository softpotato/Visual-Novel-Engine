package visualNovel.core;

// Don't know what to do with imports for now
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Couldn't think of a good name for the window, so I just went with core because this encapsulates
 * all the lesser functions and data for the program. This is the primary interface for the user
 * to access the data from the outside. This will also encapsulate the graphical portions.
 * 
 * <p>
 * 
 * Potential Problems List
 * <ul>
 * 	<li> 
 * 		Used up memory space from loading the store, and not being able to release it because
 * 		Java doesn't give control of memory. TODO: check Java 11's new update on the issue.
 * 	</li>
 * 	<li>
 * 		To Add...
 * 	</li>
 * </ul>
 * 
 * @author Soft Potato
 * @version 0.1 - Laughing Cow
 *
 */
public class Core {
	public long window;
	
	private Library downloaded;
	private Sample online;		// TODO: make an online library collection of the books
								// or alternatively, make everyone who has one of the book
								// become their own server. Wait, don't that's dangerous if there
								// is a data leak or hack. 
	
	// TODO: make network server to make this constructor more meaningful and stuff.
	public Core() {
	}
	
	/**
	 * Currently too lazy to give a bother in reading the API tutorial that glfw or lwjgl gives,
	 * so I'm just going to follow this game tutorial and implement the code that it uses for it's
	 * 2D visual and adapt it for mine, because I am a lazy and pirating asshole. 
	 * This is website, if you want to pirate as well 
	 * 
	 * http://getdecoded.org/learn/java/lwjgl/display/
	 */
	public void setupDisplay() {
		
		// Sets the console where it throws it's error messages. Will change when actually making
		// more official release.
		// TODO: Fix this into a error text file for debugging if problem arises, also after
		// releasing official release.
		GLFWErrorCallback.createPrint(System.err).set();
		
		// ***Just going to copy from DISPLAYTEST class
		// GLFW settings, can't find this on Javadoc for some reason. If you find it, please
		// message me as soon as possible so I can get updated. I'm guessing this is the default
		// window settings for all the windows?!?! TODO: test this idea out somewhere. Will 
		// update on the idea later.
		glfwDefaultWindowHints();	// Idk what this is
		glfwWindowHint(GLFW_VISIBLE,GLFW_FALSE);	// Makes window invisible on creation
		glfwWindowHint(GLFW_RESIZABLE,GLFW_TRUE);	// Makes window resizeable
		
		window = glfwCreateWindow(300,300,"Display Test", NULL,NULL);
		if (window == NULL)
			throw new IllegalStateException("Failed to create new GLFW window");
		
		glEnable(GL_TEXTURE_2D);
		
	}
	
}
