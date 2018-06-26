package entity;

public class Sprite {
	protected Portrait idle;
	protected int x,y;
	
	public Sprite(Portrait idle,int x,int y) {
		this.idle = idle;
		this.x = x;
		this.y = y;
	}
	
	public Portrait getIdle() {
		return idle;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setIdle(Portrait idle) {
		this.idle = idle;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}
