package TP2.ResPuzzle.modProb;

import TP2.pee.modprob.Estado;
import puzzle.Puzzle;

public class EstadoPuzzle  extends  Estado{
	
	private Puzzle puzzle;
	
	public EstadoPuzzle(Puzzle puzzle) {
		this.puzzle = puzzle;
	}

	@Override
	public int hashCode() {
		return puzzle.hashCode();
	}
	
	@Override
	public String toString() {
		return puzzle.toString();
	}
	
	public Puzzle getPuzzle() {
		return puzzle;
	}
	

}
