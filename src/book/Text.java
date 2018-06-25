package book;

/*
 * This class is the super class of all text in order to make the flow of the modular.
 */
public class Text {
	protected String text;
	protected boolean bottomBar;
	
	public Text(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
}
