package entity;

import core.Animation;

/*
 * Unclear how this should be, but this is an entity that is for a point & click version of the game instead of a pure
 * light novel. I don't like it, so I'm adding some aspects that make it a point & click game. This should be a basic entity,
 * though there should also be some that do basic actions or have a specific A.I. Those will extend off of this class.
 * 
 * This Entity just stands there
 */
public class Entity extends Sprite {
	protected boolean interactive;		// Can you talk to the character
	protected Animation idleAnimation;	// The animation while the character is in idle
	
	public Entity(Portrait idle,int x,int y,boolean interactive,Animation idleAnimation) {
		super(idle,x,y);
		this.interactive = interactive;
		this.idleAnimation = idleAnimation;
	}
	
	public boolean getInteractive() {
		return interactive;
	}
	
	public Animation getIdleAnimation() {
		return idleAnimation;
	}
	
	public Image getIdleAnimation(double time) {
		return idleAnimation.getImage(time);
	}
	
	public void setInteractive(boolean interactive) {
		this.interactive = interactive;
	}
	
	public void setIdleAnimation(Animation idleAnimation) {
		this.idleAnimation = idleAnimation;
	}
	
}
