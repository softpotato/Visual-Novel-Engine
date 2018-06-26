package extra;

import core.Animation;
import javafx.scene.image.Image;

/*
 * TODO: make an alternative particle that is based on code and math instead of images
 */
public class Particle {
	private Animation particle;
	private int x,y,xVeloc,yVeloc;
	
	public Particle(Animation particle,int x,int y,int xVeloc,int yVeloc) {
		this.particle = particle;
		this.x = x;
		this.y = y;
		this.xVeloc = xVeloc;
		this.yVeloc = yVeloc;
	}
	
	public Image getParticle(double time) {
		return particle.getImage(time);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getXVeloc() {
		return xVeloc;
	}
	
	public int getYVeloc() {
		return yVeloc;
	}
	
	public void setParticle(Animation particle) {
		this.particle = particle;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXVeloc(int xVeloc) {
		this.xVeloc = xVeloc;
	}
	
	public void setYVeloc(int yVeloc) {
		this.yVeloc = yVeloc;
	}
	
}
