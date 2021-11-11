package TP2.pee.melhorprim;

import TP2.pee.mecproc.No;
import TP2.pee.modprob.ProblemaHeur;

public class ProcuraAA extends ProcuraMelhorPrim<ProblemaHeur> implements ProcuraHeur{
	
	protected double f(No no) {
		//utiliza o custo e a heuristica das diferentes procuras
		//f(n) = h(n)+g(n)
		return problema.heuristica(no.getEstado()) + no.getCusto();
	}
}
