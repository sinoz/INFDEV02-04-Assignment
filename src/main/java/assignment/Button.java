package assignment;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * A {@link GUIElement} that acts as a mere button.
 * @author I.A
 */
public class Button implements GUIElement {
	/**
	 * Defines the position and the resolution of this {@link Button}.
	 */
	private final Rectangle rectangle;

	/**
	 * The color of this button.
	 */
	public Color color;

	/**
	 * The {@link Runnable} action to execute when a press event occurs.
	 */
	private final Runnable action;

	/**
	 * Creates a new {@link Button}.
	 */
	public Button(Rectangle rectangle, Runnable action) {
		this.rectangle = rectangle;
		this.action = action;
	}

	/**
	 * Returns whether the given {@link Vector2} point intersects with this {@link Button}.
	 */
	public boolean intersectsWith(Vector2 point) {
		boolean withinTopLeftCorner = point.x > rectangle.x && point.y > rectangle.y;
		boolean withinBottomRightCorner = point.x < rectangle.x + rectangle.width && point.y < rectangle.y + rectangle.height;

		return withinTopLeftCorner && withinBottomRightCorner;
	}

	@Override
	public void draw(DrawVisitor visitor) {
		// TODO missing code here
	}

	@Override
	public void update(UpdateVisitor visitor) {
		// TODO missing code here
	}
}
