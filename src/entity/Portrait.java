package entity;

import javafx.scene.image.Image;

public class Portrait {
	protected Image image;				// The image of the entity
	protected boolean clickActivated;	// This is to tell if it will read for click input at that image
	
	public Portrait(Image image,boolean clickActivated) {
		this.image = image;
		this.clickActivated = clickActivated;
	}
	
	public Image getImage() {
		return this.image;
	}
	
	public boolean getClickActivated() {
		return this.clickActivated;
	}
	
	public void setImage(Image image) {
		this.image = image;
	}
	
	public void setClickActivated(boolean clickActivated) {
		this.clickActivated = clickActivated;
	}
	
}
