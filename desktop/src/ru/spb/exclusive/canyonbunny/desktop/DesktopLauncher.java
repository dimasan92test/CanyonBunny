package ru.spb.exclusive.canyonbunny.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;

import ru.spb.exclusive.canyonbunny.CanyonBunnyMain;

public class DesktopLauncher {
	private static boolean rebuildAtlas = false;
	private static boolean drawDebugOutline = false;

	public static void main (String[] arg) {
		if (rebuildAtlas) {
			Settings settings = new Settings();
			settings.maxWidth = 1024; // maximum dimensions (in pixels) for the texture atlas
			settings.maxHeight = 1024; // (in pixels) for the texture atlas
			settings.duplicatePadding = false;
			settings.debug = drawDebugOutline; // debug lines should be added to the atlas or not
			TexturePacker.process(settings, "assets-raw/images",
					"../android/assets/images", "canyonbunny.pack");
		}
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new CanyonBunnyMain(), config);
	}
}
