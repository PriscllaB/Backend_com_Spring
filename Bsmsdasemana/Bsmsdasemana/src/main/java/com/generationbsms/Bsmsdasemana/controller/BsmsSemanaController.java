package com.generationbsms.Bsmsdasemana.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("bsmsSemana")
public class BsmsSemanaController {
	
	@GetMapping
	public String bsmssemana() {
		
		return "Nessa semana pretendo ter persistência para compreender os contéudos, então irei: \n-Assistindo videos no youtube \n-Lendo os cookbooks \n-fazendo atividadades para praticar  ";
		
		
	}

}
