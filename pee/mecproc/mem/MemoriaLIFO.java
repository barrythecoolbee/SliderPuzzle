package TP2.pee.mecproc.mem;

import java.util.Collections;
import java.util.LinkedList;

import TP2.pee.mecproc.No;

public class MemoriaLIFO extends MemoriaProcura{
	
	public MemoriaLIFO() {
		super(Collections.asLifoQueue(new LinkedList<No>()));
		
	}
}
