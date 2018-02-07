package ru.spb.exclusive.canyonbunny;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.math.Interpolation;

import ru.spb.exclusive.canyonbunny.game.Assets;
import ru.spb.exclusive.canyonbunny.screens.DirectedGame;
import ru.spb.exclusive.canyonbunny.screens.MenuScreen;
import ru.spb.exclusive.canyonbunny.screens.transitions.ScreenTransition;
import ru.spb.exclusive.canyonbunny.screens.transitions.ScreenTransitionSlice;
import ru.spb.exclusive.canyonbunny.util.AudioManager;
import ru.spb.exclusive.canyonbunny.util.GamePreferences;

public class CanyonBunnyMain extends DirectedGame {
    private static final String TAG = CanyonBunnyMain.class.getName();

    @Override
    public void create() {
        // Set Libgdx log level
        Gdx.app.setLogLevel(Application.LOG_DEBUG);

        // Load assets
        Assets.instance.init(new AssetManager());

        // Load preferences for audio settings and start playing music
        GamePreferences.instance.load();
        AudioManager.instance.play(Assets.instance.music.song01);

        // Start game at menu screen
        ScreenTransition transition = ScreenTransitionSlice.init(2,
                ScreenTransitionSlice.UP_DOWN, 10, Interpolation.pow5Out);
        setScreen(new MenuScreen(this), transition);
    }
}
