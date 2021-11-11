package TP2.pee.prof;

import TP2.pee.Solucao;
import TP2.pee.modprob.Problema;

public class ProcuraProfIter extends ProcuraProf{
	private int incProf;
	
	public ProcuraProfIter(int incProf) {
		this.incProf = incProf;
	}
	
	public int getIncProf() {
		return this.incProf;
	}
	
	public void setIncProf(int incProf) {
		this.incProf = incProf;
	}
	
	public Solucao resolver(Problema problema, int profMax) {
		
		for(int i = this.incProf; i < profMax; i+=this.incProf) {
			Solucao solucao = super.resolver(problema,i);
			
			if(i == profMax) {
				return null;
			}
			
			if(solucao != null) {
				return solucao;
			}
		}
		return null;
		
	}
}
