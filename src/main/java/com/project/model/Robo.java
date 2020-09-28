package com.project.model;

public class Robo {
	private Head head;
	private Arm arm_right;
	private Arm arm_left;
	
	public Robo() {
		super();
	}
	
	public Robo(Head head, Arm arm_right, Arm arm_left) {
		super();
		this.head = head;
		this.arm_right = arm_right;
		this.arm_left = arm_left;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Arm getArm_right() {
		return arm_right;
	}

	public void setArm_right(Arm arm_right) {
		this.arm_right = arm_right;
	}

	public Arm getArm_left() {
		return arm_left;
	}

	public void setArm_left(Arm arm_left) {
		this.arm_left = arm_left;
	}
		

}
