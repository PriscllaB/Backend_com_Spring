package com.generationbsms.Bsms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("bsms")
public class BsmsController {
	
    @GetMapping
	public String bsms() {
		return "Persistencia, Mentalidade de crescimento, Orientação ao Futuro, Reposabilidade pessoal, Proatividade, Comunicação, Trabalho em Equipe e Orientação ao detalhe";
		
	}
	
}
