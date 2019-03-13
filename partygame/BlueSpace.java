/**
 * 
 */
package partygame;

/**
 * @author Barberj1
 *
 */
public class BlueSpace extends Space {

	public BlueSpace(Space parent) {
		super(parent, null, new StopOnBlueSpace());

		//TODO Draw sprite
	}

}

class StopOnBlueSpace implements BoardEvent {

	@Override
	public EventOutcome runEvent(JavaParty game, Player target) {

		if (game.isEndgameActive()) {
			return new EventOutcome() {

				@Override
				public void applyOutcome() throws Exception {
					target.addCoins(9);
				}
			};
		} else {
			return new EventOutcome() {

				@Override
				public void applyOutcome() throws Exception {
					target.addCoins(3);
				}
			};
		}
	}

}
