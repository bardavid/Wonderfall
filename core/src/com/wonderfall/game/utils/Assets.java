package com.wonderfall.game.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class Assets {

	public static Skin skin;
	public static Texture player;
	public static Texture throwable1;
	public static Texture throwable2;
	public static Texture throwable3;
	public static Texture throwable4;
	public static Texture background;
	public static Texture enemy;
    public static Texture pause;
    public static Texture resume;
	public static Texture button;
	public static Texture button_locked;

	public static void load() {
		skin = new Skin(Gdx.files.internal("data/uiskin.json"));

		player = new Texture(Gdx.files.internal("player/player.png"));
		throwable1 = new Texture(Gdx.files.internal("throwable/throwable1.png"));
		throwable2 = new Texture(Gdx.files.internal("throwable/throwable2.png"));
		throwable3 = new Texture(Gdx.files.internal("throwable/throwable3.png"));
		throwable4 = new Texture(Gdx.files.internal("throwable/throwable4.png"));
		background = new Texture(Gdx.files.internal("backgrounds/background1.jpg"));
		enemy = new Texture(Gdx.files.internal("enemy/enemy.png"));
        pause = new Texture(Gdx.files.internal("pause.png"));
        resume = new Texture(Gdx.files.internal("play.png"));
		button = new Texture(Gdx.files.internal("buttons/button_enabled"));
		button_locked = new Texture(Gdx.files.internal("buttons/button_disabled"));

	}
}