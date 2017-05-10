package assignment;

/**
 * A visitor to aid in drawing {@link GUIElement}s.
 * @author I.A
 */
public interface DrawVisitor {
	/**
	 * Draws a {@link Button} actor.
	 */
	void drawButton(Button button);

	/**
	 * Draws a {@link Label} actor.
	 */
	void drawLabel(Label label);

	/**
	 * Draws the GUI.
	 */
	void drawGui(GUIManager gui);
}
