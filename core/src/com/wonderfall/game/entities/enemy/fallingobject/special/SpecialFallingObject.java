package com.wonderfall.game.entities.enemy.fallingobject.special;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.*;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.wonderfall.game.entities.enemy.fallingobject.CommonFallingObject;
import com.wonderfall.game.gamecontroller.GameController;
import com.wonderfall.game.utils.GameState;

public class SpecialFallingObject extends CommonFallingObject {

	// the representation of the action in the JSON
	String speciality;

	public SpecialFallingObject(Texture texture, Vector2 initialPosition, Vector2 velocity, String speciality) {
		super(texture, initialPosition, velocity);
		this.speciality = speciality;

		addAction(forever(sequence(Actions.color(Color.FIREBRICK, 1f), Actions.color(Color.WHITE, 1f))));
	}

	@Override
	public void playerCollision() {

		// increment special count
		GameState.specials.put(speciality, GameState.specials.get(speciality) + 1);
		// remove actor from its group
		this.remove();
		// propagate to GameController
		GameController.triggerObjectWin(this);
	}

	@Override
	public void floorCollision() {
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
}
