package com.sudoku.models;

public enum Posicao {
	UM(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9);
	
	private int valor;
	
	Posicao(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public static Posicao byNumero(int numero){
		for(Posicao posicao : values())
			if(numero == posicao.getValor()) return posicao;
		
		return null;
	}
}
