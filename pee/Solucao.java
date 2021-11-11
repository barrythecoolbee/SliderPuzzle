package TP2.pee;

import java.util.Iterator;

public interface Solucao extends Iterable<PassoSolucao>{
	
	public abstract Iterator<PassoSolucao> iterator();
	public abstract int getDimensao();
	public abstract double getCusto();

}
