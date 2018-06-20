package com.sudoku.models;

public enum Marcador {
	UM(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9);
	
	private int peso;
	
	Marcador(int peso){
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
}
