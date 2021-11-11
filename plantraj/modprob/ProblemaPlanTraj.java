package TP2.plantraj.modprob;

import TP2.pee.modprob.Estado;
import TP2.pee.modprob.Problema;

public class ProblemaPlanTraj extends Problema{
	
	private EstadoLocalidade estadoFinal;
	
	public ProblemaPlanTraj(String locIni, String locfin, OperadorLigacao[] operadores) {
		//converter localidades em estados
		super(new EstadoLocalidade(locIni), operadores);
		this.estadoFinal = new EstadoLocalidade(locfin);
	}
	
	@Override
	public boolean objetivo(Estado estado) {
		if(estado.equals(estadoFinal)){
			return true;
		}
		return false;
	}
	
}
