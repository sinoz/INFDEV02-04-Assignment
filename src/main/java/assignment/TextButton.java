package assignment;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * A {@link Button} that accepts and draws text content which is essentially a {@link Label}.
 * @author I.A
 */
public final class TextButton extends Button {
	/**
	 * The {@link Label} to place inside of this button.
	 */
	public final Label label;

	/**
	 * The color of this button.
	 */
	public Color color;

	/**
	 * Creates a new {@link TextButton}.
	 */
	public TextButton(String textContent, int size, Rectangle rectangle, Runnable action) {
		super(rectangle, action);

		this.label = new Label(textContent, size, new Vector2(rectangle.x, rectangle.y));
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
