package com.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.sudoku.models.Celula;
import com.sudoku.models.Marcador;
import com.sudoku.models.Posicao;

public class Sudoku {
	
	private final int TAMANHO_SUDOKU = 9;
	
	private List<List<Celula>> jogo = new ArrayList<>();

	private List<List<List<Celula>>> backup = new ArrayList<>();
	private List<List<Marcador>> resultados;
	
	public Sudoku(){
		for(int linha = 1; linha <= TAMANHO_SUDOKU; linha++){
			ArrayList<Celula> celulas = new ArrayList<>();
			
			for(int coluna = 1; coluna <= TAMANHO_SUDOKU; coluna++){
				Posicao quadrante = quadranteBuilder(linha, coluna);
				
				Celula celula = new Celula(Posicao.byNumero(linha), Posicao.byNumero(coluna), quadrante);
				celulas.add(celula);
			}
			
			jogo.add(celulas);
		}
	}

	private Posicao quadranteBuilder(int linha, int coluna) {
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
		return quadrante;
	}
	
	public List<List<Celula>> getJogo() {
		return jogo;
	}
	
	public void marcaNumero(Marcador numero, Posicao linha, Posicao coluna){
		Celula celula = jogo.get(linha.getValor() - 1).get(coluna.getValor() - 1);
		celula.setValor(numero);
	}
	
	public void soluciona() {
		boolean isSolucionado = false;
		
		while(!isSolucionado){
			this.resultados = calcula();
			if(this.resultados.isEmpty()) isSolucionado = true;
			
			long qtdCelulasSolucionadas = this.resultados.stream().filter(lista -> lista.size() == 1).count();
			if(qtdCelulasSolucionadas == 0)
				chuta();
			
			long possibilidadesImpossiveis = this.resultados.stream().filter(lista -> lista.isEmpty()).count();
			if(possibilidadesImpossiveis > 0){
				this.jogo = copiaJogo(backup.get(0));
			}
		}

	}

	private void chuta() {
		backup.add(copiaJogo(jogo));

		for(List<Celula> celulas : jogo)
			for(Celula celula : celulas)
				if(celula.getValor() == Marcador.VAZIO){
					List<Marcador> valores = calcula(celula);
					if(valores.size() == 2){
						celula.setValor(valores.get(new Random().nextInt(valores.size())));
						return;
					}
				}
	}

	private List<List<Celula>> copiaJogo(List<List<Celula>> antigo) {
		List<List<Celula>> novo = new ArrayList<>();
		
		for(int linha = 0; linha < TAMANHO_SUDOKU; linha++){
			ArrayList<Celula> celulas = new ArrayList<>();
			
			for(int coluna = 0; coluna < TAMANHO_SUDOKU; coluna++){
				Celula celula = antigo.get(linha).get(coluna);
				Celula novaCelula = new Celula(celula.getLinha(), celula.getColuna(), celula.getQuadrante());
				novaCelula.setValor(celula.getValor());
				
				celulas.add(novaCelula);
			}
			novo.add(celulas);
		}
		
		return novo;
	}

	private List<List<Marcador>> calcula() {
		List<List<Marcador>> resultados = new ArrayList<>();
		
		for(List<Celula> celulas : jogo){
			for(Celula celula : celulas){
				if(celula.getValor() == Marcador.VAZIO){
					List<Marcador> valores = calcula(celula);
					if(valores.size() == 1) celula.setValor(valores.get(0));
					resultados.add(valores);
				}
			}
		}
		
		return resultados;
	}
	
	private List<Marcador> calcula(Celula celula){
		List<Marcador> valores = new ArrayList<>(Arrays.asList(Marcador.values()));
		valores.remove(Marcador.VAZIO);
		
		valores.removeAll(numerosNaLinhaDa(celula));
		valores.removeAll(numerosNaColunaDa(celula));
		valores.removeAll(numerosNoQuadranteDa(celula));
		
		return valores;
	}
	
	private List<Marcador> numerosNaLinhaDa(Celula celula){
		List<Celula> linha = jogo.get(celula.getLinha().getValor() -1);
		List<Marcador> numeros = new ArrayList<>();
		
		for(Celula elemento : linha) 
			if(elemento.getValor() != null)
				numeros.add(elemento.getValor());
		
		return numeros;
	}
	
	private List<Marcador> numerosNaColunaDa(Celula celula){
		List<Marcador> numeros = new ArrayList<>();
		
		for(List<Celula> coluna : jogo){
			Celula elemento = coluna.get(celula.getColuna().getValor() -1);
			if(elemento.getValor() != null) 
				numeros.add(elemento.getValor());
		}
		
		return numeros;
	}
	
	private List<Marcador> numerosNoQuadranteDa(Celula celula){
		List<Marcador> numeros = new ArrayList<>();
		
		for(List<Celula> elementos : jogo)
			for(Celula elemento : elementos)
				if(celula.getQuadrante() == elemento.getQuadrante())
					if(elemento.getValor() != null) 
						numeros.add(elemento.getValor());
						
		return numeros;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		
		for(List<Celula> celulas : jogo){
			for(Celula celula: celulas){
				string.append(celula.getValor() == Marcador.VAZIO ? "_" : celula.getValor().getPeso());
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
