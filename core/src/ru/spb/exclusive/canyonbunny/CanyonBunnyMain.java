package ru.spb.exclusive.canyonbunny;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;

import ru.spb.exclusive.canyonbunny.game.Assets;
import ru.spb.exclusive.canyonbunny.screens.MenuScreen;

public class CanyonBunnyMain extends Game {
    private static final String TAG = CanyonBunnyMain.class.getName();

    @Override
    public void create () {
        // Set Libgdx log level
        Gdx.app.setLogLevel(Application.LOG_DEBUG);

        // Load assets
        Assets.instance.init(new AssetManager());

        // Start game at menu screen
        setScreen(new MenuScreen(this));
    }
}
