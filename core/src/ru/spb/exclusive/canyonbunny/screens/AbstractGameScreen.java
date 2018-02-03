package ru.spb.exclusive.canyonbunny.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;

import ru.spb.exclusive.canyonbunny.game.Assets;

public abstract class AbstractGameScreen implements Screen {

    protected DirectedGame game;

    public AbstractGameScreen (DirectedGame game) {
        this.game = game;
    }

    public abstract InputProcessor getInputProcessor ();

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {
        Assets.instance.init(new AssetManager());
    }

    @Override
    public void dispose() {
        Assets.instance.dispose();
    }
}