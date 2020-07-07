package com.qintess.ingressos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.qintess.ingressos.dao.Dao;
import com.qintess.ingressos.entidade.Ingresso;

@Controller
@RequestMapping("/ingresso")
public class IngressoController {
	
	@Autowired
	private Dao dao;
	
	
	@RequestMapping("")
	public String carrega (Model model) {
		
		model.addAttribute("ingressos", dao.buscaTodos(Ingresso.class));
		model.addAttribute("ingresso", new Ingresso());
		return "ingresso";
			
	}
	
	@RequestMapping("/salva")
	public String salva(@ModelAttribute Ingresso ingresso,
						@RequestParam(required=false, value="cancela") String cancela,
						RedirectAttributes redirectAtt) {
		
		try {
			if(cancela != null) {
				return "redirect:/ingresso";
			}
			if(ingresso.getId() == 0) {
				dao.salva(ingresso);
				
				redirectAtt.addFlashAttribute("mensagemSucesso","ingresso cadastrado com sucesso!");
			}else {
				dao.altera(ingresso);
				redirectAtt.addFlashAttribute("mensagemSucesso","ingresso alterado com sucesso!");
			}			
		} catch(Exception e) {
			//aqui vai nossa mensagem de erro... vamos colocar no model!
			redirectAtt.addFlashAttribute("mensagemErro", "ERRO GRAVE: " + e.getMessage());
			
			
		}
		
		return "redirect:/ingresso";
		
	}
	@RequestMapping("/deleta/{id}")
	public String deleta(@PathVariable(name="id")int id,
						 RedirectAttributes redirectAtt) {
		
		Ingresso ingresso = dao.buscaPorId(Ingresso.class, id);
		dao.deleta(ingresso);
		redirectAtt.addFlashAttribute("mensagemSucesso","Ingresso deletado com sucesso!");
		return "redirect:/ingresso";
	}
	
	@RequestMapping("/altera/{id}")
	public String carregaAlterar(@PathVariable(name="id")int id, Model model) {
		
		model.addAttribute("ingressos", dao.buscaTodos(Ingresso.class));
		model.addAttribute("ingresso", dao.buscaPorId(Ingresso.class, id));
		return "ingresso";
	}


}
