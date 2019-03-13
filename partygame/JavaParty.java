/**
 * 
 */
package partygame;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Barberj1
 *
 */
public class JavaParty extends Application {

	private final int totalTurns;
	private final boolean hasEndgame; // aka, "Last 5 Turns"

	private int currentTurn = 0;
	private boolean endgameActive = false;

//	Constructors
	/**
	 * 
	 * @param numberOfTurns - how many rounds the game should last before scoring
	 * @param useEndgame    - whether to use additional rules during the final 5
	 *                      turns
	 */
	public JavaParty(int numberOfTurns, boolean useEndgame) {
		totalTurns = numberOfTurns;
		hasEndgame = useEndgame;
	}

//	Accessor methods
	public int getCurrentTurn() {
		return currentTurn;
	}

	public boolean isEndgameActive() {
		return endgameActive;
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		launch(args);
	}

}
