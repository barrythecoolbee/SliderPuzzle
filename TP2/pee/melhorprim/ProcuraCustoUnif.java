package TP2.pee.melhorprim;

import TP2.pee.Procura;
import TP2.pee.mecproc.No;
import TP2.pee.modprob.Problema;
import TP2.pee.modprob.ProblemaHeur;

public class ProcuraCustoUnif extends ProcuraMelhorPrim<Problema> implements Procura{
	
	protected double f(No no) {
		//f(n) = g(n)
		//sendo que g(n) apenas usa o CUSTO
		return no.getCusto();
	}

}
