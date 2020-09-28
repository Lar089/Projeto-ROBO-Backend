package com.project.state.head;

public enum Slope {
	
	UP(0,"Para Cima"), IN_REST(1,"Em Repouso"), 
	DOWN (2,"Para Baixo");
	
	private int id_final;
	private String state_final;
	
	Slope(int lId, String lState){
		state_final = lState;
		id_final = lId;
	}
	
	public int getId() {
		return id_final;
	}
	
	public String getState_final() {
		return state_final;
	}
	
	public static int getIdInvalid() {
		return DOWN.getId();
	}
	
}
