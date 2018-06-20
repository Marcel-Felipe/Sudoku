package com.sudoku.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jogo {
	
	private List<List<Celula>> jogo = new ArrayList<>();
	
	public Jogo(){
		for(int linha = 1; linha <= 9; linha++){
			ArrayList<Celula> celulas = new ArrayList<>();
			
			for(int coluna = 1; coluna <= 9; coluna++){
				Posicao quadrante = null;
				
				if(Arrays.asList(Posicao.UM, Posicao.DOIS, Posicao.TRES).contains(Posicao.byNumero(linha))){
					if(Arrays.asList(Posicao.UM, Posicao.DOIS, Posicao.TRES).contains(Posicao.byNumero(coluna))) quadrante = Posicao.UM;
					if(Arrays.asList(Posicao.QUATRO, Posicao.CINCO, Posicao.SEIS).contains(Posicao.byNumero(coluna))) quadrante = Posicao.DOIS;
					if(Arrays.asList(Posicao.SETE, Posicao.OITO, Posicao.NOVE).contains(Posicao.byNumero(coluna))) quadrante = Posicao.TRES;
				}
				if(Arrays.asList(Posicao.QUATRO, Posicao.CINCO, Posicao.SEIS).contains(Posicao.byNumero(linha))){
					if(Arrays.asList(Posicao.UM, Posicao.DOIS, Posicao.TRES).contains(Posicao.byNumero(coluna))) quadrante = Posicao.QUATRO;
					if(Arrays.asList(Posicao.QUATRO, Posicao.CINCO, Posicao.SEIS).contains(Posicao.byNumero(coluna))) quadrante = Posicao.CINCO;
					if(Arrays.asList(Posicao.SETE, Posicao.OITO, Posicao.NOVE).contains(Posicao.byNumero(coluna))) quadrante = Posicao.SEIS;
				}
				if(Arrays.asList(Posicao.SETE, Posicao.OITO, Posicao.NOVE).contains(Posicao.byNumero(linha))){
					if(Arrays.asList(Posicao.UM, Posicao.DOIS, Posicao.TRES).contains(Posicao.byNumero(coluna))) quadrante = Posicao.SETE;
					if(Arrays.asList(Posicao.QUATRO, Posicao.CINCO, Posicao.SEIS).contains(Posicao.byNumero(coluna))) quadrante = Posicao.OITO;
					if(Arrays.asList(Posicao.SETE, Posicao.OITO, Posicao.NOVE).contains(Posicao.byNumero(coluna))) quadrante = Posicao.NOVE;
				}
				
				Celula celula = new Celula(Posicao.byNumero(linha), Posicao.byNumero(coluna), quadrante);
				celulas.add(celula);
			}
			
			jogo.add(celulas);
		}
	}
	
	public void marcaNumero(Marcador numero, Posicao linha, Posicao coluna){
		Celula celula = jogo.get(linha.getValor() - 1).get(coluna.getValor() - 1);
		celula.setValor(numero);
	}
	
	public void resolve() {
		for(List<Celula> celulas : jogo){
			for(Celula celula : celulas){
				if(celula.getValor() == null) resolve(celula);
			}
		}
		System.out.println("\n\n");
	}
	
	public void resolve(Celula celula){
		List<Marcador> valores = new ArrayList<>(Arrays.asList(Marcador.values()));;
		
		List<Celula> linha = jogo.get(celula.getLinha().getValor() -1);
		for(Celula valorLinha : linha){
			if(valores.contains(valorLinha.getValor())) valores.remove(valorLinha.getValor());
		}
		
		for(List<Celula> coluna : jogo){
			Celula valorColuna = coluna.get(celula.getColuna().getValor() -1);
			if(valores.contains(valorColuna.getValor())) valores.remove(valorColuna.getValor());
		}
		
		for(List<Celula> valorCelulas : jogo)
			for(Celula valorCelula : valorCelulas)
				if(celula.getQuadrante() == valorCelula.getQuadrante())
					if(valores.contains(valorCelula.getValor())) 
						valores.remove(valorCelula.getValor());
		
		System.out.println(valores + " " + celula.getLinha().getValor() + "-" + celula.getColuna().getValor());
		if(valores.size() == 1) celula.setValor(valores.get(0));
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		
		for(List<Celula> celulas : jogo){
			for(Celula celula: celulas){
				string.append(celula.getValor() == null ? "_" : celula.getValor().getPeso());
				string.append(" ");
				
				if(celula.getColuna() == Posicao.TRES || celula.getColuna() == Posicao.SEIS)
					string.append("   ");
			}
			string.append("\n");
			if(celulas.get(0).getLinha() == Posicao.TRES ||celulas.get(0).getLinha() == Posicao.SEIS)
				string.append("\n");
		}
		
		return string.toString();
	}
}
