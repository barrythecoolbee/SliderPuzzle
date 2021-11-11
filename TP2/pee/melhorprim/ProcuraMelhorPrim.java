package TP2.pee.melhorprim;

import java.util.Comparator;

import TP2.pee.mecproc.MecanismoProcura;
import TP2.pee.mecproc.No;
import TP2.pee.mecproc.mem.MemoriaPrioridade;
import TP2.pee.mecproc.mem.MemoriaProcura;
import TP2.pee.modprob.Problema;

public abstract class ProcuraMelhorPrim <P extends Problema> extends MecanismoProcura<P> implements Comparator<No>{
	
	
	protected MemoriaProcura iniciarMemoria() {
		
		return new MemoriaPrioridade(this);
	}
	
	
	public int compare(No o1, No o2) {
		/*if0{
			=
		}
		if f(o1)>f(o2){
			1>2
		}*/
		/* quando 1 -> o1 > o2
		 * quando 0 -> o1 = o2
		   quando -1 -> o1 < o2 */
		
		return Double.compare(f(o1), f(o2));
	}
	
	protected abstract double f(No no);
}
