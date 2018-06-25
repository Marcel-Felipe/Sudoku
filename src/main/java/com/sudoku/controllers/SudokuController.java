package com.sudoku.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sudoku.Sudoku;
import com.sudoku.SudokuResolver;
import com.sudoku.models.Celula;

@Controller
public class SudokuController {

	private Sudoku sudoku;

	@GetMapping("/")
	public String index(Model model){
		sudoku = new Sudoku();
		
		SudokuResolver.primeiroJogo(sudoku);
		List<List<Celula>> jogo = sudoku.getJogo();
		
		model.addAttribute("jogo", jogo);
		return "sudoku";
	}
	
	@GetMapping("/resolver")
	public String resolver(Model model){
		sudoku.soluciona();
		model.addAttribute("jogo", sudoku.getJogo());
		return "sudoku";
	}
	
	@GetMapping("/limpar")
	public String limpar(Model model){
		sudoku = new Sudoku();
		List<List<Celula>> jogo = sudoku.getJogo();
		
		model.addAttribute("jogo", jogo);
		return "sudoku";
	}
}
