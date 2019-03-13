package partygame;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;

public class Space {

	private Space previous;
	private ArrayList<Space> next = new ArrayList<Space>();

	private BoardEvent passEvent;
	private BoardEvent stopEvent;

	private Node sprite; // Visual representation

//	Constructors
	public Space() { // Used for path start spaces ONLY
		previous = null;
	}

	public Space(Space parent) {
		previous = parent;
		parent.addChild(this);
	}

	public Space(Space parent, BoardEvent pass, BoardEvent stop) {
		previous = parent;
		parent.addChild(this);

		passEvent = pass;
		stopEvent = stop;
	}

//	Accessor methods
	public Space previous() {
		return previous;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Space> getNext() {
		return (ArrayList<Space>) next.clone();
	}

	public boolean isJunction() {
		return (next.size() > 1);
	}

	public Node getSprite() {
		return sprite;
	}

//	Board assembly	
	public void addChild(Space child) {
		next.add(child);
	}

	public void setPassEvent(BoardEvent event) {
		passEvent = event;
	}

	public void setStopEvent(BoardEvent event) {
		stopEvent = event;
	}
}
