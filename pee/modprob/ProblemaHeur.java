package TP2.pee.modprob;

public abstract class ProblemaHeur extends Problema{
	public ProblemaHeur(Estado estadoinicial, Operador[] operadores) {
		super(estadoinicial, operadores);
	}
	public abstract double heuristica(Estado estado);
	
}
