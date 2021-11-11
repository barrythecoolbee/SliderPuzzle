package TP2.pee.melhorprim;

import TP2.pee.Solucao;
import TP2.pee.modprob.ProblemaHeur;

abstract interface ProcuraHeur{
	
	public Solucao resolver(ProblemaHeur problema);
	public Solucao resolver(ProblemaHeur problema, int profMax);

}
