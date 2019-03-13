package partygame;

public interface BoardEvent {

	/**
	 * Override with the details of a specific event.
	 * 
	 * @param game - the current {@link JavaParty} instance running
	 * @param target - the {@link Player} who initiated this event. Other players
	 *                may participate as well.
	 * @return a {@link EventOutcome} object representing what happens as a
	 *         consequence of this event.
	 */
	public EventOutcome runEvent(JavaParty game, Player target);

}
