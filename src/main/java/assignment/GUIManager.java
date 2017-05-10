package assignment;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages all of the {@link GUIElement}s.
 * @author I.A
 */
public final class GUIManager implements Updatable, Drawable {
	/**
	 * The collection of {@link GUIElement}s.
	 */
	public final List<GUIElement> elements = new ArrayList<>();

	/**
	 * Creates a new {@link GUIManager}.
	 */
	public GUIManager(Runnable exitAction) {
		elements.add(new Label("Hi Ahmed", 10, new Vector2(50, 50)));
		elements.add(new TextButton("Click Me!", 10, new Rectangle(0, 100, 100, 30), () -> {
			elements.clear();
			elements.add(new TextButton("Exit", 10, new Rectangle(0, 0, 100, 30), exitAction));
		}));
	}

	@Override
	public void draw(DrawVisitor visitor) {
		visitor.drawGui(this);
	}

	@Override
	public void update(UpdateVisitor visitor) {
		// TODO missing code here
	}
}
