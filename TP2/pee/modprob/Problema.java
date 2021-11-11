package TP2.pee.modprob;

import TP2.pee.Procura;

public abstract class Problema{
	
	private Estado estadoinicial;
	private Operador[] operadores;
	
	public Problema(Estado estadoinicial, Operador[] operadores) {
		this.estadoinicial = estadoinicial;
		this.operadores = operadores;
	}
	
	public Estado getEstadoInicial() {
		return estadoinicial;
	}
	
	public Operador[] getOperadores() {
		return operadores;
	}
	
	public abstract boolean objetivo(Estado estado);
	/*if(estado == objetivo) {
			return true;
		}*/
}
