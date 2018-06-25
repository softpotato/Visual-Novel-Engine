package book;

import javafx.scene.image.Image;

/**
 * This class is solely for dialogue Speakers, who are in a consistent line of text. The speaker will not be interactive on
 * any level, though if you want a more in depth story/dialogue, then use the InteractiveSpeaker class.
 * 
 * @author Softp
 *
 */
public class Speaker extends Sprite {
	
	
	public Speaker(Image sprite,int x,int y) {
		super(sprite,x,y);
	}
	
}
