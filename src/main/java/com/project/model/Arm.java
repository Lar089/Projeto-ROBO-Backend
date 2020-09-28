package com.project.model;

import com.project.state.arm.Elbow;
import com.project.state.arm.Pulse;

public class Arm {
	private int elbow = Elbow.IN_REST.getId();
	private int pulse = Pulse.IN_REST.getId();
	
	public Arm() {
		super();
	}

	public Arm(int elbow, int pulse) {
		super();
		this.elbow = elbow;
		this.pulse = pulse;
	}

	public int getElbow() {
		return elbow;
	}

	public void setElbow(int elbow) {
		this.elbow = elbow;
	}

	public int getPulse() {
		return pulse;
	}

	public void setPulse(int pulse) {
		this.pulse = pulse;
	}

	
	
	
}