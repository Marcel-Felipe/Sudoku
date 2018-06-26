package com.sudoku.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Marcador {
	VAZIO(0), UM(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9);
	
	private int peso;
	
	Marcador(int peso){
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}

	public static List<Marcador> valores(){
		List<Marcador> valores = new ArrayList<>(Arrays.asList(Marcador.values()));
		valores.remove(Marcador.VAZIO);
		
		return valores;
	}
}
