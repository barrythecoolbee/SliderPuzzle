package TP2.ResPuzzle.modProb;

import TP2.pee.modprob.Estado;
import TP2.pee.modprob.Operador;
import puzzle.Puzzle;
import puzzle.Puzzle.Movimento;

public class OperadorPuzzle implements Operador {
	
	private int custoJog;
	private Movimento movimento;
	
	public OperadorPuzzle(Movimento movimento) {
		this.custoJog = 1;
		this.movimento = movimento;
	}

	@Override
	public Estado aplicar(Estado estado) {
		
		Puzzle puzzle, newPuzzle;
		
		if(estado instanceof EstadoPuzzle){
			puzzle = ((EstadoPuzzle) estado).getPuzzle();
			newPuzzle = puzzle.movimentar(movimento);
			if(newPuzzle != null){
				return new EstadoPuzzle(newPuzzle);
			}
		}
		return null;
	}

	@Override
	public float custo(Estado estado, Estado estadoSuc) {
		return custoJog;
	}

}
