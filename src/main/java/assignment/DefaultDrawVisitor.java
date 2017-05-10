package assignment;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * A {@link DrawVisitor} to draw the {@link GUIElement}s.
 * @author I.A
 */
public final class DefaultDrawVisitor implements DrawVisitor {
	/**
	 * The {@link SpriteBatch} to draw on.
	 */
	private final SpriteBatch batch;

	/**
	 * Creates a new {@link DefaultDrawVisitor}.
	 */
	public DefaultDrawVisitor(SpriteBatch batch) {
		this.batch = batch;
	}

	@Override
	public void drawButton(Button button) {
		// TODO missing code here
	}

	@Override
	public void drawLabel(Label label) {
		label.font.draw(batch, label.textContent, label.position.x, label.position.y);
	}

	@Override
	public void drawGui(GUIManager gui) {
		for (GUIElement element : gui.elements) {
			element.draw(this);
		}
	}
}
