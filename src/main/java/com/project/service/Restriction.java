package com.project.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @author Caroline
 * O estado inicial dos movimentos é Em Repouso. (ok)
 * Só poderá movimentar o Pulso caso o Cotovelo esteja Fortemente Contraído.(ok)
 * Só poderá Rotacionar a Cabeça caso sua Inclinação da Cabeça não esteja em
estado Para Baixo. (ok)
*Ao realizar a progressão de estados, é necessário que sempre siga a ordem
crescente ou decrescente, por exemplo, a partir do estado 4, pode-se ir para
os estados 3 ou 5, nunca pulando um estado. (ok)
* Atenção aos limites! Se tentar enviar um estado inválido você irá corromper o
sistema do R.O.B.O.
 *
 */

@Service
public class Restriction {
	
	
	public boolean movementInvalid(int idMax, int idObject) {
		if (idMax < idObject || idObject < 0) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public boolean nextMovement(int idOldState, int idNewState) {
		if (idNewState == (idOldState + 1) || 
				idNewState == (idOldState - 1) || 
				idNewState == idOldState) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean movementPulse(int idValid, int idObject) {
		if (idObject == idValid) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean movementRotation(int idValid, int idObject) {
		if (idObject != idValid) {
			return true;
		} else {
			return false;
		}
		
	}
		
	
	
}
