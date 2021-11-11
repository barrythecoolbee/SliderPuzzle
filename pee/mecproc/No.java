package TP2.pee.mecproc;

import TP2.pee.PassoSolucao;
import TP2.pee.modprob.Estado;
import TP2.pee.modprob.Operador;

public class No implements PassoSolucao{
	
	private int profundidade = 0;
	private double custo = 0.0;
	private Estado estado;
	private Operador operador;
	private No antecessor;
	
	public No(Estado estado) {
		this.estado = estado;
	}
	
	public No(Estado estado, Operador operador, No antecessor) {
		this.estado = estado;
		this.operador = operador;
		this.antecessor = antecessor;
		
		//o valor da profundidade atual de um nó é o valor do antecessor+1
		profundidade = this.antecessor.getProfundidade() + 1;
		
		//o valor do custo atual de um nó é a soma do antecssor com o custo atual
		custo = antecessor.getCusto() + operador.custo(antecessor.getEstado(), estado);
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public Operador getOperador() {
		return operador;
	}
	
	public No getAntecessor() {
		return antecessor;
	}
	
	public int getProfundidade() {
		return profundidade;
	}
	
	public double getCusto() {
		return custo;
	}

}
