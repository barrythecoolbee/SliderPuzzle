package TP2.pee.mecproc.mem;

import java.util.HashMap;
import java.util.Queue;

import TP2.pee.mecproc.No;
import TP2.pee.modprob.Estado;

public class MemoriaProcura {
	
	private Queue<No> fronteira;
	protected HashMap<Estado,No> explorados; 
	private int numMaxTodosNos = 0;
	private int numMaxNo = 0;
	private int totalNos = 0;
	
	public MemoriaProcura(Queue<No> fronteira) {
		this.fronteira = fronteira;
		this.explorados = new HashMap<Estado,No>();
	}
	
	public void limpar() {
		explorados.clear();
		fronteira.clear();
	}
	
	public void inserir(No no) {
		//sempre que se insere, é um nó explorado
		Estado estado = no.getEstado();
		No noMem = explorados.get(estado);
		if(noMem == null?true:no.getCusto() < noMem.getCusto()){
			fronteira.add(no);
			explorados.put(estado, no);
			totalNos++;
			numMaxNo++;
		} else {
			if(numMaxTodosNos< numMaxNo) {
				numMaxTodosNos = numMaxNo;
				numMaxNo = 0;
			}
		}
	}
	
	public No remover() {
		//remove o primeiro elemento da queue
		return fronteira.poll();
	}
	
	public boolean fronteiraVazia() {
		if(fronteira.isEmpty()) {
			return true;
		}
		return false;
	}
	
	 public int getComplexidadeTemporal(){
		 return this.totalNos;
	}
	
	public int getComplexidadeEspacial(){
		return this.numMaxTodosNos;
	}

}
