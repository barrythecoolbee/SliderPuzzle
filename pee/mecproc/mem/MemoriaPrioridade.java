package TP2.pee.mecproc.mem;

import java.util.Comparator;
import java.util.PriorityQueue;

import TP2.pee.mecproc.No;

public class MemoriaPrioridade extends MemoriaProcura{
	
	public MemoriaPrioridade(Comparator<No> comparador) {
		super(new PriorityQueue<No>(1,comparador));
	}

}
