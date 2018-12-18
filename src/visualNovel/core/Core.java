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
 * @author Soft Potato
 * @version 0.1 - Laughing Cow
 *
 */
public class Core {
	public long window;
	
	private Library downloaded;
	private Library online;		// TODO: make an online library collection of the books
								// or alternatively, make everyone who has one of the book
								// become their own server. Wait, don't that's dangerous if there
								// is a data leak or hack.
	
	public Core() {
	}
	
}
