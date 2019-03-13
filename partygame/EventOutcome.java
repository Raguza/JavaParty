package partygame;

public abstract class EventOutcome {

	private String message;

//	Constructors
	public EventOutcome() {
		message = "";
	}

	public EventOutcome(String message) {
		this.message = message;
	}

//	Accessor methods	
	public String getMessage() {
		return message;
	}

//	Abstract methods	
	/**
	 * Override to determine what a specific outcome should do. All affects and
	 * targets should be determined by the originating {@link BoardEvent} class.
	 * 
	 * @throws Exception
	 */
	public abstract void applyOutcome() throws Exception;
}
