package com.qintess.ingressos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("") // ler após o nome do projeto
	public String index() {//ler mapeamento do index
		return "index";//representa o nome da jsp que será chamada
		
		// todos os métodos precisam retornar uma String, para retornar o nome da jsp
		
		
	}
}
