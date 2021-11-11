package TP2.plantraj.modprob;

import TP2.pee.modprob.Estado;

public class EstadoLocalidade extends Estado{
	
	private String localidade;
	
	public EstadoLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	public int hashCode() {
		return localidade.hashCode();
		
	}
	
	public String toString() {
		return "Estado: " + localidade;
		
	}
}
