package TP2.plantraj;

import TP2.pee.PassoSolucao;
import TP2.pee.Procura;
import TP2.pee.Solucao;
import TP2.pee.larg.ProcuraLarg;
import TP2.pee.melhorprim.ProcuraCustoUnif;
import TP2.pee.prof.ProcuraProf;
import TP2.pee.prof.ProcuraProfIter;
import TP2.plantraj.modprob.OperadorLigacao;
import TP2.plantraj.modprob.ProblemaPlanTraj;

public class PlaneadorTrajecto{
	
	public static void main(String[] args) {
		/**
		* Definir operadores
		**/
		OperadorLigacao[] operadores = definirOperadores();
		
		/**
		* Definir problema
		**/
		ProblemaPlanTraj problema = new ProblemaPlanTraj("loc0", "loc4", operadores);
		
		/**
		* Procurar Solução
		**/
		//ProcuraProfIter procura = new ProcuraProfIter(1);
		ProcuraProf procura = new ProcuraProf();
		//ProcuraLarg procura = new ProcuraLarg();
		//ProcuraCustoUnif procura = new ProcuraCustoUnif();
		
		Solucao solucao = procura.resolver(problema);
		
		/**
		* Mostrar trajeto com a solução encontrada
		**/
		mostrarTrajecto(solucao);
		
		System.out.println("Preço do percurso:" + solucao.getCusto());
	}
	
	private static OperadorLigacao[] definirOperadores() {
		OperadorLigacao[] operadores = {
				new OperadorLigacao("loc0", "loc1", 5),
				new OperadorLigacao("loc0", "loc2", 25),
				new OperadorLigacao("loc1", "loc3", 12),
				new OperadorLigacao("loc1", "loc6", 5),
				new OperadorLigacao("loc2", "loc4", 30),
				new OperadorLigacao("loc3", "loc2", 10),
				new OperadorLigacao("loc3", "loc5", 5),
				new OperadorLigacao("loc4", "loc3", 2),
				new OperadorLigacao("loc5", "loc6", 8),
				new OperadorLigacao("loc5", "loc4", 10),
				new OperadorLigacao("loc6", "loc3", 15),
		};
		return operadores;
		
	}
	
	/*
	 * Mostrar trajeto
	 * @param solucao  Solucao da procura de trajeto
	 */
	private static void mostrarTrajecto(Solucao solucao) {
		if(solucao != null) {
			System.out.printf("Trajeto:\n");
			for(PassoSolucao s : solucao) {
				System.out.println(s.getEstado());
			}
		}
	}
}
