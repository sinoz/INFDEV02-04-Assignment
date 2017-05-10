package assignment;

/**
 * An actor that is drawable on the screen.
 * @author I.A
 */
public interface Drawable {
	/**
	 * Draws the actor.
	 */
	void draw(DrawVisitor visitor);
}
