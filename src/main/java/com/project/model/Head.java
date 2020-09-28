package com.project.model;

import com.project.state.head.Rotation;
import com.project.state.head.Slope;

public class Head {
	private int rotation = Rotation.IN_REST.getId();
	private int slope = Slope.IN_REST.getId();
	
	public Head() {
		super();
	}

	public Head(int rotation, int slope) {
		super();
		this.rotation = rotation;
		this.slope = slope;
	}

	public int getRotation() {
		return rotation;
	}

	public void setRotation(int rotation) {
		this.rotation = rotation;
	}

	public int getSlope() {
		return slope;
	}

	public void setSlope(int slope) {
		this.slope = slope;
	}

	

}
