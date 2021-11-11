package TP2.pee.modprob;


public abstract class Estado{
	
	public boolean equals(Object obj) {
		if(this.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}
	
	public abstract int hashCode(); //retorna uma identificação unica de uma classe para cada objeto
	
}
