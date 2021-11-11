package TP2.pee;

import TP2.pee.modprob.Estado;
import TP2.pee.modprob.Operador;

public interface PassoSolucao {
	public abstract Estado getEstado();
	public abstract double getCusto();
	public abstract Operador getOperador();
}
