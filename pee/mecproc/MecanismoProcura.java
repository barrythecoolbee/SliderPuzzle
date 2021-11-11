package TP2.pee.mecproc;

import TP2.pee.Solucao;
import TP2.pee.mecproc.mem.MemoriaProcura;
import TP2.pee.modprob.Estado;
import TP2.pee.modprob.Operador;
import TP2.pee.modprob.Problema;

public abstract class MecanismoProcura <P extends Problema>{
	protected P problema;
	private MemoriaProcura memoriaProcura;
	private No no_inicial, no;
	
	public MecanismoProcura() {
		this.problema = null;
		this.no_inicial = null;
		this.no = null;
		this.memoriaProcura = iniciarMemoria();
	}
	
	protected abstract MemoriaProcura iniciarMemoria();
	
	public Solucao resolver(P problema) {
		
		//resolver(profMax é Integer maxValue);
		return resolver(problema,Integer.MAX_VALUE);
	}

	public Solucao resolver(P problema, int profMax) {
		this.problema = problema;
		memoriaProcura.limpar();
		no_inicial = new No(problema.getEstadoInicial());
		memoriaProcura.inserir(no_inicial);
		while(!memoriaProcura.fronteiraVazia()) {
			no = memoriaProcura.remover();
			if(problema.objetivo(no.getEstado())) {
				return gerarSolucao(no);
			} else {
				if(no.getProfundidade() < profMax) {
					expandir(no);
				}
			}
		}
		return null;
	}
	
	private void expandir(No no) {
		Estado estado = no.getEstado();
		Estado estadoSuc = null;
		No noSuc = null;
		
		Operador[] operadores = problema.getOperadores();
		
		for(Operador operador : operadores) {
			estadoSuc = operador.aplicar(estado);
			if(estadoSuc != null) {
				noSuc = new No(estadoSuc, operador, no);
				memoriaProcura.inserir(noSuc);
			}
		}
	}
	
	private Solucao gerarSolucao(No noFinal) {
		Percurso percurso = new Percurso();
		no = noFinal;
		No antecessor = null;
		while(no != null) {
			percurso.juntarInicio(no);
			antecessor = no.getAntecessor();
			no = antecessor;
		}
		return percurso;
	}
	
	
	public int getComplexidadeTemporal(){
		return memoriaProcura.getComplexidadeTemporal();
	}
	
	public int getComplexidadeEspacial(){
		return memoriaProcura.getComplexidadeEspacial();
	}
}
