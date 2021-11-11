package TP2.pee;

import TP2.pee.modprob.Problema;

public abstract interface Procura {
	
	public abstract Solucao resolver(Problema problema);
	public abstract Solucao resolver(Problema problema, int profMax);
}
