package TP2.plantraj.modprob;

import TP2.pee.modprob.Estado;
import TP2.pee.modprob.Operador;

public class OperadorLigacao implements Operador{
	
	private int custoLigacao;
	private EstadoLocalidade estadoOrigem;
	private EstadoLocalidade estadoDestino;

	public OperadorLigacao(String locIni, String locfin, int custo) {
		this.custoLigacao = custo;
		this.estadoDestino = new EstadoLocalidade(locfin);
		this.estadoOrigem = new EstadoLocalidade(locIni);
	}
	
	public Estado aplicar(Estado estado) {
		return estado.equals(estadoOrigem) ? estadoDestino: null;
		
	}
	
	public float custo(Estado estado, Estado estadoSuc) {
		return custoLigacao;
		
	}

}
