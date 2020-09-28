package com.project.state.arm;

public enum Elbow {
	IN_REST(0,"Em Repouso"), SLIGHTLY_CONTRACTED(1,"Levemente Contraído"), 
	CONTRACTED(2,"Contraído"), STRONGLY_CONTRACTED(3,"Fortemente Contraído");
	
	private int id_final;
	private String state_final;
	
	Elbow(int lId, String lState){
		id_final = lId;
		state_final = lState;
	}
	
	public int getId() {
		return id_final;
	}
	
	public String getState_final() {
		return state_final;
	}

	public static int getIdValid() {
		return STRONGLY_CONTRACTED.getId();
	}
	

}
