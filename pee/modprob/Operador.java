package TP2.pee.modprob;

public abstract interface Operador{
	public abstract Estado aplicar(Estado estado);
	public abstract float custo(Estado estado, Estado estadoSuc);
}
