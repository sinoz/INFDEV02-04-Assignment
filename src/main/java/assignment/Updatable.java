package assignment;

/**
 * An actor that can be updated.
 * @author I.A
 */
public interface Updatable {
	/**
	 * Updates the actor.
	 */
	void update(UpdateVisitor visitor);
}
