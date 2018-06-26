package entity;

/*
 * Note: This is a bad name, so probably don't use this... XD
 */
public class Object extends Sprite {
	protected boolean obtainable;	// Can the item be picked up
	
	public Object(Portrait idle,int x,int y,boolean obtainable) {
		super(idle,x,y);
		this.obtainable = obtainable;
	}
	
	public boolean getObtainable() {
		return obtainable;
	}
	
	public void setObtainable(boolean obtainable) {
		this.obtainable = obtainable;
	}
	
}
