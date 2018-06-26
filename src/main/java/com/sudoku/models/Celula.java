package com.sudoku.models;

public class Celula {

	private final Posicao linha;
	private final Posicao coluna;
	private final Posicao quadrante;
	
	private Marcador valor;
	
	private boolean calculado = false;

	public Celula(Posicao linha, Posicao coluna, Posicao quadrante) {
		this.linha = linha;
		this.coluna = coluna;
		this.quadrante = quadrante;
	}

	public void setValor(Marcador valor) {
		if(valor != null)
			this.valor = valor;
	}
	
	public Posicao getLinha() {
		return linha;
	}

	public Posicao getColuna() {
		return coluna;
	}

	public Posicao getQuadrante() {
		return quadrante;
	}

	public Marcador getValor() {
		return valor;
	}

	public boolean isCalculado() {
		return calculado;
	}
	
	public void setCalculado() {
		this.calculado = true;
	}
}
