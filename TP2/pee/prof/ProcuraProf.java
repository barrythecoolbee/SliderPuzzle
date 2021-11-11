package TP2.pee.prof;

import TP2.pee.Procura;
import TP2.pee.mecproc.MecanismoProcura;
import TP2.pee.mecproc.mem.MemoriaLIFO;
import TP2.pee.mecproc.mem.MemoriaProcura;
import TP2.pee.modprob.Problema;

public class ProcuraProf extends MecanismoProcura<Problema> implements Procura{
	@Override
	protected MemoriaProcura iniciarMemoria() {
		MemoriaLIFO lifo = new MemoriaLIFO();
		return lifo;
	}
}
