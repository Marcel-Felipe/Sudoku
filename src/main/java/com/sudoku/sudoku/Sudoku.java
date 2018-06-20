package com.sudoku.sudoku;

import static com.sudoku.models.Marcador.*;

import com.sudoku.models.Jogo;
import com.sudoku.models.Posicao;

public class Sudoku {
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		
		primeiroJogo(jogo);
		
		System.out.println(jogo);
		System.out.println("\n\n");
		
		for(int i = 0; i < 20; i++)
			jogo.resolve();
		
		System.out.println(jogo);
	}

	private static void primeiroJogo(Jogo jogo) {
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
	
	private static void segundoJogo(Jogo jogo) {
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
}
