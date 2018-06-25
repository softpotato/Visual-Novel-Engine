package core;

import javafx.scene.image.Image;

/*
 * Note: I legit copied this code right out of a JavaFX tutorial, though I don't understand any of it. I might change it
 * or never use it.
 */
public class Animation {
	private Image[] frames;
	private double duration;
	
	public Animation(Image[] frames,double duration) {
		this.frames = frames;
		this.duration = duration;
	}
	
	/*
	 * TODO: Add exception here to catch if there is no Images loaded.
	 */
	public Image getImage(double time) {
		
		if (frames.length > 1) {
			int index = (int) ((time % (frames.length * duration)) / duration);
			
			return frames[index];
		} else {
			return frames[0];
		}
		
	}
	
}
