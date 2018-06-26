package entity;

import java.util.ArrayList;

public class DynSpeaker extends Speaker {
	protected ArrayList<Portrait> emotions;
	
	public DynSpeaker(Portrait idle,int x,int y,boolean frame,ArrayList<Portrait> emotions) {
		super(idle,x,y,frame);
		this.emotions = emotions;
	}
	
	public ArrayList<Portrait> getEmotions() {
		return emotions;
	}
	
	public Portrait getEmotions(int index) {
		if (index == 0) {
			return idle;
		}
		return emotions.get(index - 1);
	}
	
	public void setEmotions(ArrayList<Portrait> emotions) {
		this.emotions = emotions;
	}
	
	public void addEmotion(Portrait newEmotion) {
		emotions.add(newEmotion);
	}
	
}
