package book;

import javafx.scene.image.Image;
import core.*;

/**
 * This class is intended for static elements that don't require any interactions of the sort, but is just there. Like the
 * background, though this should not be used for particles because there will be a particle class. The image will only exist
 * if the book page
 * 
 * @author Soft Potato
 *
 */
public class Sprite {
	protected Animation sprite;	// The Sprite Image, though it can be an animation
	protected int x,y;			// The X and Y coordinate of the image
	
	public Sprite(Image sprite,int x,int y) {
		this(new Animation(new Image[] {sprite},),x,y);
	}
	
	public Sprite(Animation sprite,int x,int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
	}
	
}
