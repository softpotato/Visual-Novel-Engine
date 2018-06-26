package entity;

public class Speaker extends Sprite {
	protected boolean frame;	// Like a picture frame that it reads from the page
	
	public Speaker(Portrait idle,int x,int y,boolean frame) {
		super(idle,x,y);
		this.frame = frame;
	}
	
	public boolean getFrame() {
		return this.frame;
	}
	
	public void setFrame(boolean frame) {
		this.frame = frame;
	}
	
}
