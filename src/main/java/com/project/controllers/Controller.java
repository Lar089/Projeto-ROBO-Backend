package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Arm;
import com.project.model.Head;
import com.project.model.Robo;
import com.project.service.Restriction;
import com.project.state.arm.Elbow;
import com.project.state.arm.Pulse;
import com.project.state.head.Rotation;
import com.project.state.head.Slope;

@org.springframework.stereotype.Controller

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class Controller {
	
	@Autowired(required = true)
	private Restriction restriction;
	
	private Head head = new Head();
	private Arm left_arm = new Arm();
	private Arm right_arm = new Arm();
	
	private Robo robo = new Robo(head, left_arm, right_arm);
	
	
	@GetMapping("/robo")
	public Robo getRobo() {
		Message.MESSAGE_START.getMessage();
		return robo;
	}
	
	
	@PutMapping("/head-slope/{idSlope}")
	public Head upDateSlope(@PathVariable Integer idSlope) {
		if (restriction.movementInvalid(Slope.getIdInvalid(), idSlope)) {
			if(restriction.nextMovement(head.getSlope(), idSlope)) {
				head.setSlope(idSlope);
				Message.SUCCESS.getMessage();
			} else {
				Message.PROGRESSION_ERROR.getMessage();
			}
		} else {
			Message.ERROR.getMessage();
		}
		Message.TRY_AGAIN.getMessage();
		return head;
	}
	
	@PutMapping("/head-rotation/{idRotation}")
	public Head upDatePulsRotation(@PathVariable Integer idRotation) {
		if (restriction.movementInvalid(Rotation.getIdInvalid(), idRotation)) {
			if(restriction.nextMovement(head.getRotation(), idRotation)) {
				if(restriction.movementRotation(head.getRotation(), idRotation)) {
					head.setRotation(idRotation);
					Message.SUCCESS.getMessage();
				} else {
					Message.PULSE_ERROR.getMessage();
				}
			} else {
				Message.PROGRESSION_ERROR.getMessage();
			}
		} else {
			Message.ERROR.getMessage();
		}	
		Message.TRY_AGAIN.getMessage();
		return head;
	}
	
	@PutMapping("/arm-elbow/{idElbow}/{elbow_side}")
	public Arm upDateElbow(@PathVariable Integer idElbow, @PathVariable String elbow_side) {
		if (elbow_side.toLowerCase().equals("direito")) {
			if (restriction.movementInvalid(Elbow.getIdValid(), idElbow)) {
				if(restriction.nextMovement(right_arm.getElbow(), idElbow)) {
					right_arm.setElbow(idElbow);
					Message.SUCCESS.getMessage();
				} else {
					Message.PROGRESSION_ERROR.getMessage();
				}
			} else {
				Message.ERROR.getMessage();
			}	
			return right_arm;
		} else if (elbow_side.toLowerCase().equals("esquerdo")) {
			if (restriction.movementInvalid(Elbow.getIdValid(), idElbow)) {
				if(restriction.nextMovement(left_arm.getElbow(), idElbow)) {
					left_arm.setElbow(idElbow);
					Message.SUCCESS.getMessage();
				} else {
					Message.PROGRESSION_ERROR.getMessage();
				}
			} else {
				Message.ERROR.getMessage();
			}	
			return left_arm;
		}
		Message.TRY_AGAIN.getMessage();
		return right_arm;
	}
	
	
	@PutMapping("/arm-pulse/{idPulse}/{pulse_side}")
	public Arm upDatePulse(@PathVariable Integer idPulse, @PathVariable String pulse_side) {
		if (pulse_side.toLowerCase().equals("direito")) {
			if (restriction.movementInvalid(Pulse.getIdInvalid(), idPulse)) {
				if(restriction.nextMovement(right_arm.getPulse(), idPulse)) {
					right_arm.setPulse(idPulse);
					Message.SUCCESS.getMessage();
				} else {
					Message.PROGRESSION_ERROR.getMessage();
				}
			} else {
				Message.ERROR.getMessage();
			}	
			return right_arm;
		} else if (pulse_side.toLowerCase().equals("esquerdo")) {
			if (restriction.movementInvalid(Pulse.getIdInvalid(), idPulse)) {
				if(restriction.nextMovement(left_arm.getPulse(), idPulse)) {
					left_arm.setPulse(idPulse);
					Message.SUCCESS.getMessage();
				} else {
					Message.PROGRESSION_ERROR.getMessage();
				}
			} else {
				Message.ERROR.getMessage();
			}	
			return left_arm;
		}
		Message.TRY_AGAIN.getMessage();
		return right_arm;
	}
	
	
	
	

}
