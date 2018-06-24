package core;

import javafx.scene.image.Image;

/*
 * Note: I legit copied this code right out of a JavaFX tutorial, though I don't understand any of it. I might change it
 * or never use it.
 */
public class Animation {
	private Image[] frames;
	private double duration;
	
	public Image getImage(double time) {
		
		int index = (int) ((time % (frames.length * duration)) / duration);
		
		return frames[index];
		
	}
	
}
