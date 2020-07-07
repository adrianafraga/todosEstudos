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
import com.qintess.ingressos.entidade.Cliente;


@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private Dao dao;
	
	
	@RequestMapping("")
	public String carrega (Model model) {
		
		model.addAttribute("clientes", dao.buscaTodos(Cliente.class));
		model.addAttribute("cliente", new Cliente());
		return "cliente";
			
	}
	
	@RequestMapping("/salva")
	public String salva(@ModelAttribute Cliente cliente,
						@RequestParam(required=false, value="cancela") String cancela,
						RedirectAttributes redirectAtt) {
		
		try {
			if(cancela != null) {
				return "redirect:/cliente";
			}
			if(cliente.getId() == 0) {
				dao.salva(cliente);
				
				redirectAtt.addFlashAttribute("mensagemSucesso","Cliente cadastrado com sucesso!");
			}else {
				dao.altera(cliente);
				redirectAtt.addFlashAttribute("mensagemSucesso","Cliente alterado com sucesso!");
			}			
		} catch(Exception e) {
			//aqui vai nossa mensagem de erro... vamos colocar no model!
			redirectAtt.addFlashAttribute("mensagemErro", "ERRO GRAVE: " + e.getMessage());
			
			
		}
		
		return "redirect:/cliente";
		
	}
	@RequestMapping("/deleta/{id}")
	public String deleta(@PathVariable(name="id")int id,
						 RedirectAttributes redirectAtt) {
		
		Cliente cliente = dao.buscaPorId(Cliente.class, id);
		dao.deleta(cliente);
		redirectAtt.addFlashAttribute("mensagemSucesso","Cliente deletado com sucesso!");
		return "redirect:/cliente";
	}
	
	@RequestMapping("/altera/{id}")
	public String carregaAlterar(@PathVariable(name="id")int id, Model model) {
		
		model.addAttribute("clientes", dao.buscaTodos(Cliente.class));
		model.addAttribute("cliente", dao.buscaPorId(Cliente.class, id));
		return "cliente";
	}

}

