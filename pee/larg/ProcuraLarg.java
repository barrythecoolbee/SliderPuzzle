package TP2.pee.larg;

import TP2.pee.Procura;
import TP2.pee.mecproc.MecanismoProcura;
import TP2.pee.mecproc.mem.MemoriaFIFO;
import TP2.pee.mecproc.mem.MemoriaProcura;
import TP2.pee.modprob.Problema;

public class ProcuraLarg extends MecanismoProcura<Problema> implements Procura{

	@Override
	public MemoriaProcura iniciarMemoria() {
		MemoriaFIFO fifo = new MemoriaFIFO();
		return fifo;
	}

}
