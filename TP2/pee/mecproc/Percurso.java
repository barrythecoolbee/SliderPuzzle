package TP2.pee.mecproc;

import java.util.Iterator;
import java.util.LinkedList;

import TP2.pee.PassoSolucao;
import TP2.pee.Solucao;

public class Percurso implements Solucao {
	
	private LinkedList<PassoSolucao> percurso = new LinkedList<PassoSolucao>(); 
	
	public int getDimensao() {
		if(percurso.isEmpty()){
			return 0;
		}
		return percurso.size();
	}
	
	public double getCusto() {
		if(percurso != null) {
			return percurso.getLast().getCusto();
		} else {
			return -1.0;
		}
	}
	
	public Iterator<PassoSolucao> iterator(){
		return percurso.iterator();
	}
	
	public void juntarInicio(No no) {
		percurso.addFirst(no);
	}
}
