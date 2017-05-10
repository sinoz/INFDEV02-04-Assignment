package assignment;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * The main entry point to this GUI application.
 * @author I.A
 */
public final class Main {
	/**
	 * The title for this GUI application.
	 */
	public static final String APP_TITLE = "INFDEV02-04 Assignment";

	/**
	 * The main entry point to instantiate a new {@link LwjglApplication}.
	 */
	public static void main(String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = APP_TITLE;
		config.width = LwjglApplicationConfiguration.getDesktopDisplayMode().width;
		config.height = LwjglApplicationConfiguration.getDesktopDisplayMode().height;
		config.resizable = true;
		config.vSyncEnabled = false;

		new LwjglApplication(new GameListener(), config);
	}
}
