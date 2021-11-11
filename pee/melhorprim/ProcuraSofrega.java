package TP2.pee.melhorprim;

import TP2.pee.mecproc.No;
import TP2.pee.modprob.Problema;
import TP2.pee.modprob.ProblemaHeur;

public class ProcuraSofrega extends ProcuraMelhorPrim<ProblemaHeur> implements ProcuraHeur{
	
	protected double f(No no) {
		//apenas usa o motor da heuristica
		//f(n) = h(n)
		return problema.heuristica(no.getEstado());
	}
}
