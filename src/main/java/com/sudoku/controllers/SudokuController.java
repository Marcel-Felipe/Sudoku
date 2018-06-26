package com.sudoku.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sudoku.Sudoku;
import com.sudoku.SudokuResolver;
import com.sudoku.models.Marcador;

@Controller
public class SudokuController {

	private Sudoku sudoku;

	@GetMapping("/")
	public String index(Model model){
		sudoku = new Sudoku();
		
		SudokuResolver.segundoJogo(sudoku);
		
		model.addAttribute("sudoku", sudoku);
		model.addAttribute("numeros", Marcador.values());
		
		return "sudoku";
	}
	
	@PostMapping("/resolver")
	public String resolver(@ModelAttribute Sudoku resultado, Model model){
		System.out.println(resultado);
		resultado.soluciona();
		System.out.println(resultado);
		model.addAttribute("sudoku", resultado);
		model.addAttribute("numeros", Marcador.values());
		
		return "sudoku";
	}
}
