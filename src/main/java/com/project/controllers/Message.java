package com.project.controllers;

public enum Message {
	MESSAGE_START("Informações carregadas com sucesso"),
	TRY_AGAIN("Tente novamente!"),
	ERROR("Mundança de estado inválida"),
	PROGRESSION_ERROR("Erro ao realizar a progressão de estados"),
	SUCCESS("Mudança de estado realizada"),
	PULSE_ERROR("Errado, só pode movimentar o pulso caso o cotovelo esteja fortemente contraído."),
	ERROR_ROTATE("Errodo, só é possível rotacionar a cabeça caso sua inclinação não esteja em estado para baixo.");

	private String message;
	
	Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

}
