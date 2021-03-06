package com.base.game;

public class Player extends Entity{
	
	private Camera camera;
	
	public Player(float x, float z, float y) {
		super(x, z, y);
		camera = new Camera(this);
	}
	
	public void update(){
		if(Input.getKey(Input.KEY_W))
			moveZ(0.03f);
		if(Input.getKey(Input.KEY_S))
			moveZ(-0.03f);
		if(Input.getKey(Input.KEY_A))
			moveX(0.03f);
		if(Input.getKey(Input.KEY_D))
			moveX(-0.03f);
		if(Input.getKey(Input.KEY_SPACE))
			moveY(-0.03f);
		if(Input.getKey(Input.KEY_LSHIFT))
			moveY(0.03f);
		camera.update();
	}
	
	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}
}
