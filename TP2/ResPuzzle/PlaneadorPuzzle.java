package TP2.ResPuzzle;

import TP2.ResPuzzle.modProb.OperadorPuzzle;
import TP2.ResPuzzle.modProb.ProblemaPuzzle;
import TP2.pee.PassoSolucao;
import TP2.pee.Solucao;
import TP2.pee.larg.ProcuraLarg;
import TP2.pee.melhorprim.ProcuraAA;
import TP2.pee.melhorprim.ProcuraCustoUnif;
import TP2.pee.melhorprim.ProcuraSofrega;
import TP2.pee.prof.ProcuraProf;
import TP2.pee.prof.ProcuraProfIter;
import puzzle.Puzzle;
import puzzle.Puzzle.Movimento;

public class PlaneadorPuzzle {
	
	public static OperadorPuzzle[] definirOperadores() {
		return new OperadorPuzzle[] {
				new OperadorPuzzle(Movimento.ESQ),
				new OperadorPuzzle(Movimento.DIR),
				new OperadorPuzzle(Movimento.CIMA),
				new OperadorPuzzle(Movimento.BAIXO)
		};		
	}
	
	public static Puzzle puzzleInicialA = new Puzzle(new int[][]{
		{1,2,3},{8,4,5},{6,7,0}
	});
	public static Puzzle puzzleInicialB = new Puzzle(new int[][]{
		{8,4,5},{6,1,2},{3,7,0}
	});
	public static Puzzle puzzleFinal = new Puzzle(new int[][]{
		{1,2,3},{4,5,6},{7,8,0}
	});
	
	public static void mostrarPassos(Solucao solucao) {
		for(PassoSolucao passo : solucao) {
			System.out.println(passo.getEstado());
		}
	}
	public static void main(String[] args) {
		
		ProblemaPuzzle problemaA = new ProblemaPuzzle(puzzleInicialA,puzzleFinal,definirOperadores(), true);
		ProblemaPuzzle problemaB = new ProblemaPuzzle(puzzleInicialB,puzzleFinal,definirOperadores(), true);
		
		ProcuraProfIter procura = new ProcuraProfIter(1);
		//ProcuraProf procura = new ProcuraProf(); //A sem solucao
		//ProcuraLarg procura = new ProcuraLarg();
		//ProcuraCustoUnif procura = new ProcuraCustoUnif();
		
		//ProcuraSofrega procura = new ProcuraSofrega();
		//ProcuraAA procura = new ProcuraAA();
		
		Solucao solution = procura.resolver(problemaA);
		mostrarPassos(solution);
		
		final int complexidadeEspacial = procura.getComplexidadeEspacial();
		final int complexidadeTemporal = procura.getComplexidadeTemporal();
		
		System.out.println("Custo (Número de Movimentos): " + solution.getCusto());
		System.out.println("Complexidade Espacial: " + complexidadeEspacial);
		System.out.println("Complexidade Temporal: " + complexidadeTemporal);
		
		
	}


}
