package com.sudoku;

import static com.sudoku.models.Marcador.*;

import com.sudoku.models.Posicao;

public class SudokuResolver {
	public static void main(String[] args) {
		Sudoku jogo = new Sudoku();
		sextoJogo(jogo);
		
		System.out.println(jogo);
		System.out.println("\n\n");
		
		jogo.soluciona();
		
		System.out.println(jogo);
		System.out.println("\n\n");
	}

	public static void primeiroJogo(Sudoku jogo) {
		jogo.marcaNumero(CINCO, Posicao.UM, Posicao.UM);
		jogo.marcaNumero(TRES, Posicao.UM, Posicao.DOIS);
		jogo.marcaNumero(SETE, Posicao.UM, Posicao.CINCO);
		
		jogo.marcaNumero(SEIS, Posicao.DOIS, Posicao.UM);
		jogo.marcaNumero(UM, Posicao.DOIS, Posicao.QUATRO);
		jogo.marcaNumero(NOVE, Posicao.DOIS, Posicao.CINCO);
		jogo.marcaNumero(CINCO, Posicao.DOIS, Posicao.SEIS);

		jogo.marcaNumero(NOVE, Posicao.TRES, Posicao.DOIS);
		jogo.marcaNumero(OITO, Posicao.TRES, Posicao.TRES);
		jogo.marcaNumero(SEIS, Posicao.TRES, Posicao.OITO);

		jogo.marcaNumero(OITO, Posicao.QUATRO, Posicao.UM);
		jogo.marcaNumero(SEIS, Posicao.QUATRO, Posicao.CINCO);
		jogo.marcaNumero(TRES, Posicao.QUATRO, Posicao.NOVE);

		jogo.marcaNumero(QUATRO, Posicao.CINCO, Posicao.UM);
		jogo.marcaNumero(OITO, Posicao.CINCO, Posicao.QUATRO);
		jogo.marcaNumero(TRES, Posicao.CINCO, Posicao.SEIS);
		jogo.marcaNumero(UM, Posicao.CINCO, Posicao.NOVE);

		jogo.marcaNumero(SETE, Posicao.SEIS, Posicao.UM);
		jogo.marcaNumero(DOIS, Posicao.SEIS, Posicao.CINCO);
		jogo.marcaNumero(SEIS, Posicao.SEIS, Posicao.NOVE);

		jogo.marcaNumero(SEIS, Posicao.SETE, Posicao.DOIS);
		jogo.marcaNumero(DOIS, Posicao.SETE, Posicao.SETE);
		jogo.marcaNumero(OITO, Posicao.SETE, Posicao.OITO);
		
		jogo.marcaNumero(QUATRO, Posicao.OITO, Posicao.QUATRO);
		jogo.marcaNumero(UM, Posicao.OITO, Posicao.CINCO);
		jogo.marcaNumero(NOVE, Posicao.OITO, Posicao.SEIS);
		jogo.marcaNumero(CINCO, Posicao.OITO, Posicao.NOVE);

		jogo.marcaNumero(OITO, Posicao.NOVE, Posicao.CINCO);
		jogo.marcaNumero(SETE, Posicao.NOVE, Posicao.OITO);
		jogo.marcaNumero(NOVE, Posicao.NOVE, Posicao.NOVE);
	}
	
	private static void segundoJogo(Sudoku jogo) {
		jogo.marcaNumero(OITO, Posicao.UM, Posicao.UM);
		jogo.marcaNumero(TRES, Posicao.UM, Posicao.TRES);
		jogo.marcaNumero(SETE, Posicao.UM, Posicao.QUATRO);
		jogo.marcaNumero(CINCO, Posicao.UM, Posicao.CINCO);
		jogo.marcaNumero(DOIS, Posicao.UM, Posicao.NOVE);
		
		jogo.marcaNumero(OITO, Posicao.DOIS, Posicao.SEIS);
		jogo.marcaNumero(SETE, Posicao.DOIS, Posicao.SETE);

		jogo.marcaNumero(SETE, Posicao.TRES, Posicao.DOIS);
		jogo.marcaNumero(QUATRO, Posicao.TRES, Posicao.QUATRO);
		jogo.marcaNumero(TRES, Posicao.TRES, Posicao.SEIS);
		jogo.marcaNumero(OITO, Posicao.TRES, Posicao.NOVE);
		
		jogo.marcaNumero(TRES, Posicao.QUATRO, Posicao.DOIS);
		jogo.marcaNumero(OITO, Posicao.QUATRO, Posicao.TRES);
		jogo.marcaNumero(DOIS, Posicao.QUATRO, Posicao.SETE);
		jogo.marcaNumero(UM, Posicao.QUATRO, Posicao.NOVE);
	
		jogo.marcaNumero(DOIS, Posicao.CINCO, Posicao.UM);
		jogo.marcaNumero(SETE, Posicao.CINCO, Posicao.NOVE);

		jogo.marcaNumero(UM, Posicao.SEIS, Posicao.UM);
		jogo.marcaNumero(SETE, Posicao.SEIS, Posicao.TRES);
		jogo.marcaNumero(NOVE, Posicao.SEIS, Posicao.SETE);
		jogo.marcaNumero(QUATRO, Posicao.SEIS, Posicao.OITO);
		
		jogo.marcaNumero(TRES, Posicao.SETE, Posicao.UM);
		jogo.marcaNumero(SEIS, Posicao.SETE, Posicao.QUATRO);
		jogo.marcaNumero(CINCO, Posicao.SETE, Posicao.SEIS);
		jogo.marcaNumero(SETE, Posicao.SETE, Posicao.OITO);
		
		jogo.marcaNumero(QUATRO, Posicao.OITO, Posicao.TRES);
		jogo.marcaNumero(NOVE, Posicao.OITO, Posicao.QUATRO);

		jogo.marcaNumero(SETE, Posicao.NOVE, Posicao.UM);
		jogo.marcaNumero(DOIS, Posicao.NOVE, Posicao.CINCO);
		jogo.marcaNumero(QUATRO, Posicao.NOVE, Posicao.SEIS);
		jogo.marcaNumero(CINCO, Posicao.NOVE, Posicao.SETE);
		jogo.marcaNumero(SEIS, Posicao.NOVE, Posicao.NOVE);
	}
	
	private static void terceiroJogo(Sudoku jogo) {
		jogo.marcaNumero(DOIS, Posicao.UM, Posicao.UM);
		jogo.marcaNumero(QUATRO, Posicao.UM, Posicao.QUATRO);
		jogo.marcaNumero(UM, Posicao.UM, Posicao.CINCO);
		jogo.marcaNumero(TRES, Posicao.UM, Posicao.SEIS);
		jogo.marcaNumero(SEIS, Posicao.UM, Posicao.SETE);
		jogo.marcaNumero(OITO, Posicao.UM, Posicao.OITO);
		
		jogo.marcaNumero(DOIS, Posicao.DOIS, Posicao.QUATRO);
		jogo.marcaNumero(SEIS, Posicao.DOIS, Posicao.CINCO);
		jogo.marcaNumero(NOVE, Posicao.DOIS, Posicao.SEIS);

		jogo.marcaNumero(UM, Posicao.TRES, Posicao.OITO);
		
		jogo.marcaNumero(UM, Posicao.QUATRO, Posicao.TRES);
		jogo.marcaNumero(NOVE, Posicao.QUATRO, Posicao.OITO);
	
		jogo.marcaNumero(SEIS, Posicao.CINCO, Posicao.TRES);
		jogo.marcaNumero(NOVE, Posicao.CINCO, Posicao.QUATRO);
		jogo.marcaNumero(QUATRO, Posicao.CINCO, Posicao.SEIS);
		jogo.marcaNumero(CINCO, Posicao.CINCO, Posicao.SETE);

		jogo.marcaNumero(OITO, Posicao.SEIS, Posicao.DOIS);
		jogo.marcaNumero(TRES, Posicao.SEIS, Posicao.SETE);
		
		jogo.marcaNumero(SEIS, Posicao.SETE, Posicao.DOIS);
		
		jogo.marcaNumero(UM, Posicao.OITO, Posicao.QUATRO);
		jogo.marcaNumero(QUATRO, Posicao.OITO, Posicao.CINCO);
		jogo.marcaNumero(SETE, Posicao.OITO, Posicao.SEIS);

		jogo.marcaNumero(UM, Posicao.NOVE, Posicao.DOIS);
		jogo.marcaNumero(QUATRO, Posicao.NOVE, Posicao.TRES);
		jogo.marcaNumero(OITO, Posicao.NOVE, Posicao.QUATRO);
		jogo.marcaNumero(TRES, Posicao.NOVE, Posicao.CINCO);
		jogo.marcaNumero(SEIS, Posicao.NOVE, Posicao.SEIS);
		jogo.marcaNumero(CINCO, Posicao.NOVE, Posicao.NOVE);
	}
	
	private static void quartoJogo(Sudoku jogo) {
		jogo.marcaNumero(TRES, Posicao.UM, Posicao.TRES);
		jogo.marcaNumero(CINCO, Posicao.UM, Posicao.CINCO);
		jogo.marcaNumero(UM, Posicao.UM, Posicao.SETE);
		jogo.marcaNumero(SETE, Posicao.UM, Posicao.OITO);
		jogo.marcaNumero(QUATRO, Posicao.UM, Posicao.NOVE);
		
		jogo.marcaNumero(SETE, Posicao.DOIS, Posicao.CINCO);
		jogo.marcaNumero(UM, Posicao.DOIS, Posicao.SEIS);
		jogo.marcaNumero(DOIS, Posicao.DOIS, Posicao.SETE);

		jogo.marcaNumero(TRES, Posicao.TRES, Posicao.CINCO);
		jogo.marcaNumero(CINCO, Posicao.TRES, Posicao.OITO);
		
		jogo.marcaNumero(SETE, Posicao.QUATRO, Posicao.UM);
		jogo.marcaNumero(SEIS, Posicao.QUATRO, Posicao.DOIS);
		jogo.marcaNumero(CINCO, Posicao.QUATRO, Posicao.SEIS);
		jogo.marcaNumero(QUATRO, Posicao.QUATRO, Posicao.SETE);
	
		jogo.marcaNumero(UM, Posicao.CINCO, Posicao.UM);
		jogo.marcaNumero(SETE, Posicao.CINCO, Posicao.NOVE);

		jogo.marcaNumero(CINCO, Posicao.SEIS, Posicao.DOIS);
		jogo.marcaNumero(QUATRO, Posicao.SEIS, Posicao.TRES);
		jogo.marcaNumero(UM, Posicao.SEIS, Posicao.OITO);
		jogo.marcaNumero(SEIS, Posicao.SEIS, Posicao.NOVE);
		
		jogo.marcaNumero(QUATRO, Posicao.SETE, Posicao.DOIS);
		jogo.marcaNumero(SEIS, Posicao.SETE, Posicao.CINCO);
		
		jogo.marcaNumero(DOIS, Posicao.OITO, Posicao.TRES);
		jogo.marcaNumero(CINCO, Posicao.OITO, Posicao.QUATRO);
		jogo.marcaNumero(NOVE, Posicao.OITO, Posicao.CINCO);

		jogo.marcaNumero(NOVE, Posicao.NOVE, Posicao.UM);
		jogo.marcaNumero(OITO, Posicao.NOVE, Posicao.DOIS);
		jogo.marcaNumero(SEIS, Posicao.NOVE, Posicao.TRES);
		jogo.marcaNumero(UM, Posicao.NOVE, Posicao.CINCO);
		jogo.marcaNumero(SETE, Posicao.NOVE, Posicao.SETE);
	}
	
	private static void quintoJogo(Sudoku jogo) {
		jogo.marcaNumero(DOIS, Posicao.UM, Posicao.UM);
		jogo.marcaNumero(UM, Posicao.UM, Posicao.DOIS);
		jogo.marcaNumero(CINCO, Posicao.UM, Posicao.NOVE);
		
		jogo.marcaNumero(CINCO, Posicao.DOIS, Posicao.TRES);
		jogo.marcaNumero(UM, Posicao.DOIS, Posicao.QUATRO);
		jogo.marcaNumero(SEIS, Posicao.DOIS, Posicao.CINCO);
		jogo.marcaNumero(DOIS, Posicao.DOIS, Posicao.SETE);

		jogo.marcaNumero(SETE, Posicao.TRES, Posicao.UM);
		jogo.marcaNumero(OITO, Posicao.TRES, Posicao.DOIS);
		jogo.marcaNumero(SEIS, Posicao.TRES, Posicao.SETE);
		jogo.marcaNumero(QUATRO, Posicao.TRES, Posicao.NOVE);
		
		jogo.marcaNumero(QUATRO, Posicao.QUATRO, Posicao.UM);
		jogo.marcaNumero(SETE, Posicao.QUATRO, Posicao.TRES);
		jogo.marcaNumero(TRES, Posicao.QUATRO, Posicao.QUATRO);
		jogo.marcaNumero(UM, Posicao.QUATRO, Posicao.SEIS);
	
		jogo.marcaNumero(OITO, Posicao.SEIS, Posicao.QUATRO);
		jogo.marcaNumero(SETE, Posicao.SEIS, Posicao.SEIS);
		jogo.marcaNumero(CINCO, Posicao.SEIS, Posicao.SETE);
		jogo.marcaNumero(TRES, Posicao.SEIS, Posicao.NOVE);
		
		jogo.marcaNumero(CINCO, Posicao.SETE, Posicao.UM);
		jogo.marcaNumero(UM, Posicao.SETE, Posicao.TRES);
		jogo.marcaNumero(DOIS, Posicao.SETE, Posicao.OITO);
		jogo.marcaNumero(SEIS, Posicao.SETE, Posicao.NOVE);
		
		jogo.marcaNumero(OITO, Posicao.OITO, Posicao.TRES);
		jogo.marcaNumero(UM, Posicao.OITO, Posicao.CINCO);
		jogo.marcaNumero(SEIS, Posicao.OITO, Posicao.SEIS);
		jogo.marcaNumero(QUATRO, Posicao.OITO, Posicao.SETE);

		jogo.marcaNumero(SEIS, Posicao.NOVE, Posicao.UM);
		jogo.marcaNumero(TRES, Posicao.NOVE, Posicao.OITO);
		jogo.marcaNumero(NOVE, Posicao.NOVE, Posicao.NOVE);
	}
	
	private static void sextoJogo(Sudoku jogo) {
		jogo.marcaNumero(CINCO, Posicao.UM, Posicao.UM);
		jogo.marcaNumero(QUATRO, Posicao.UM, Posicao.DOIS);
		jogo.marcaNumero(SEIS, Posicao.UM, Posicao.SEIS);
		jogo.marcaNumero(DOIS, Posicao.UM, Posicao.NOVE);
		
		jogo.marcaNumero(TRES, Posicao.DOIS, Posicao.TRES);
		jogo.marcaNumero(NOVE, Posicao.DOIS, Posicao.CINCO);
		jogo.marcaNumero(QUATRO, Posicao.DOIS, Posicao.NOVE);

		jogo.marcaNumero(UM, Posicao.TRES, Posicao.QUATRO);
		jogo.marcaNumero(CINCO, Posicao.TRES, Posicao.OITO);
		
		jogo.marcaNumero(OITO, Posicao.QUATRO, Posicao.UM);
		jogo.marcaNumero(SEIS, Posicao.QUATRO, Posicao.QUATRO);
		jogo.marcaNumero(TRES, Posicao.QUATRO, Posicao.SEIS);
		jogo.marcaNumero(NOVE, Posicao.QUATRO, Posicao.SETE);
	
		jogo.marcaNumero(TRES, Posicao.CINCO, Posicao.DOIS);
		jogo.marcaNumero(UM, Posicao.CINCO, Posicao.OITO);

		jogo.marcaNumero(QUATRO, Posicao.SEIS, Posicao.TRES);
		jogo.marcaNumero(OITO, Posicao.SEIS, Posicao.QUATRO);
		jogo.marcaNumero(DOIS, Posicao.SEIS, Posicao.SEIS);
		jogo.marcaNumero(SEIS, Posicao.SEIS, Posicao.NOVE);
		
		jogo.marcaNumero(SEIS, Posicao.SETE, Posicao.DOIS);
		jogo.marcaNumero(SETE, Posicao.SETE, Posicao.SEIS);
		
		jogo.marcaNumero(TRES, Posicao.OITO, Posicao.UM);
		jogo.marcaNumero(OITO, Posicao.OITO, Posicao.CINCO);
		jogo.marcaNumero(SETE, Posicao.OITO, Posicao.SETE);

		jogo.marcaNumero(QUATRO, Posicao.NOVE, Posicao.UM);
		jogo.marcaNumero(TRES, Posicao.NOVE, Posicao.QUATRO);
		jogo.marcaNumero(OITO, Posicao.NOVE, Posicao.OITO);
		jogo.marcaNumero(UM, Posicao.NOVE, Posicao.NOVE);
	}
}
