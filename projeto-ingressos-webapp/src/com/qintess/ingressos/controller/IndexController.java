package com.qintess.ingressos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("") // ler ap�s o nome do projeto
	public String index() {//ler mapeamento do index
		return "index";//representa o nome da jsp que ser� chamada
		
		// todos os m�todos precisam retornar uma String, para retornar o nome da jsp
		
		
	}
}
