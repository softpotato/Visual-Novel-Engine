package test;

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

/*
 * This class is here to help me get used to LWJGL's api and structure for stuff
 * 
 * Random Note:
 * 		GLFW won't work on macOS unless you put in the JVM arguments -XstartOnFirstThread
 * 
 * 		GLFW also won't work with other window toolkits such as Swing, AWT, and JavaFX though
 * 		it works with some of them on MacOS, but the javadoc says they have to be initialized
 * 		first though.
 */
public class DisplayTest implements Runnable {
	
	public long window;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * You might be wondering, what the heck is GLFW. Well it is the window API that is supposed
	 * to be designed for OpenGL which is a 2D and 3D graphics library for C, but lwjgl has allowed
	 * access to it from java.
	 */
	public void init() {
		// This sets the GLFW error messages to go to the console when testing, though it might
		// be more advisable later on to set it to a text file for debugging.
		GLFWErrorCallback.createPrint(System.err).set();
		
		// Throws an error message if GLFW is not able to properly work
		if (!glfwInit())
			throw new IllegalStateException("Unable to initialize GLFW. Check Javadocs for "
					+ "glfw if on mac");
		
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
		
		
		glfwSetKeyCallback(window, (window, key, scancode, action, action, mods) -> {
			if (key == GLFW_KEY_ESCAPE && GLFW_RELEASE)
				glfwSetWindowShouldClose(window,true);
		});
		
	}
	
	public static void main(String[] args) {
		new DisplayTest().run();
	}
	
}
