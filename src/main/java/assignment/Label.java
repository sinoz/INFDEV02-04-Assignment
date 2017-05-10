package assignment;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;

/**
 * A {@link GUIElement} that takes text content to draw onto the screen.
 * @author I.A
 */
public final class Label implements GUIElement {
	/**
	 * The {@link String} contents of this label, to display to the user.
	 */
	public String textContent;

	/**
	 * The size of this label.
	 */
	public final int size;

	/**
	 * The {@link Vector2} position of this {@link Label} on the screen.
	 */
	public final Vector2 position;

	/**
	 * The corresponding {@link BitmapFont}.
	 */
	public final BitmapFont font;

	/**
	 * Creates a new {@link Label}.
	 */
	public Label(String textContent, int size, Vector2 position) {
		this.textContent = textContent;
		this.size = size;
		this.position = position;
		this.font = new BitmapFont();
	}

	@Override
	public void draw(DrawVisitor visitor) {
		visitor.drawLabel(this);
	}

	@Override
	public void update(UpdateVisitor visitor) {
		// TODO missing code here
	}
}
