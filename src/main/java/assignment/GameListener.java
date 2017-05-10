package assignment;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Reacts to application events.
 * @author I.A
 */
public final class GameListener implements ApplicationListener {
	/**
	 * The {@link SpriteBatch} to draw with.
	 */
	private SpriteBatch batch;

	/**
	 * The {@link DrawVisitor}.
	 */
	private DrawVisitor drawVisitor;

	/**
	 * The {@link UpdateVisitor}.
	 */
	private UpdateVisitor updateVisitor;

	/**
	 * The {@link GUIManager}.
	 */
	private GUIManager guiManager;

	@Override
	public void create() {
		batch = new SpriteBatch();
		guiManager = new GUIManager(() -> Gdx.app.exit());

		drawVisitor = new DefaultDrawVisitor(batch);
		updateVisitor = new DefaultUpdateVisitor();

		// saving you some battery power, enable this if you need more frequent draw updates
		Gdx.graphics.setContinuousRendering(false);
	}

	@Override
	public void resize(int width, int height) {
		// TODO
	}

	@Override
	public void render() {
		clear();
		update();
		draw();
	}

	/**
	 * Clears the GL buffers for the next frame.
	 */
	private void clear() {
		Gdx.gl.glClearColor(0, 0, 255, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	/**
	 * Called every frame to update the state of all of the subordinate entities.
	 */
	private void update() {
		guiManager.update(updateVisitor);
	}

	/**
	 * Called every frame to draw all of the updates.
	 */
	private void draw() {
		batch.begin();
		guiManager.draw(drawVisitor);
		batch.end();
	}

	@Override
	public void pause() {
		// TODO
	}

	@Override
	public void resume() {
		// TODO
	}

	@Override
	public void dispose() {
		batch.dispose();
	}
}
