package book;

import javafx.scene.image.Image;

/**
 * This class is intended for static elements that don't require any interactions of the sort, but is just there. Like the
 * background, though this should not be used for particles because there will be a particle class. The image will only exist
 * if the book page says so.
 * 
 * @author Soft Potato
 *
 */
public class Sprite {
	protected Image sprite;	// The Sprite Image
	protected int x,y;		// The X and Y coordinate of the image
	
	public Sprite(Image sprite,int x,int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
	}
	
}
