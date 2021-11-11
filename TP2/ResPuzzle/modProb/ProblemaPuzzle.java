package TP2.ResPuzzle.modProb;

import TP2.pee.modprob.Estado;
import TP2.pee.modprob.ProblemaHeur;
import puzzle.Puzzle;

public class ProblemaPuzzle  extends  ProblemaHeur{
	private EstadoPuzzle estadoFinal;
	private boolean manhattan;
	
	public ProblemaPuzzle(Puzzle configIni, Puzzle configObj, OperadorPuzzle[] operadores, boolean manhattan) {
		super(new EstadoPuzzle(configIni), operadores);
		this.estadoFinal = new EstadoPuzzle(configObj);
		this.manhattan = manhattan;
	}

	@Override
	public double heuristica(Estado estado) {
		EstadoPuzzle estadoAtual = (EstadoPuzzle) estado;
		Puzzle puzzleActual = estadoAtual.getPuzzle();
		Puzzle puzzleObj = this.estadoFinal.getPuzzle();
		if(this.manhattan) {
			return puzzleActual.distManhattan(puzzleObj);
		} else {
			return puzzleActual.numPecasForaLugar(puzzleObj);
		}
	}


	@Override
	public boolean objetivo(Estado estado) {
		if(estado.equals(estadoFinal)) {
			return true;
		}
		return false;
	} 

}
