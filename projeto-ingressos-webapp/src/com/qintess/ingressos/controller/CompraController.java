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
import com.qintess.ingressos.entidade.Compra;
import com.qintess.ingressos.entidade.Evento;

@Controller
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	private Dao dao;
	
	
	@RequestMapping("")
	public String carrega (Model model) {
		
		model.addAttribute("compras", dao.buscaTodos(Compra.class));
		model.addAttribute("compra", new Compra());
		return "compra";
			
	}
	
	@RequestMapping("/salva")
	public String salva(@ModelAttribute Compra compra,
						@RequestParam(required=false, value="cancela") String cancela,
						RedirectAttributes redirectAtt) {
		
		try {
			if(cancela != null) {
				return "redirect:/compra";
			}
			if(compra.getId() == 0) {
				dao.salva(compra);
				
				redirectAtt.addFlashAttribute("mensagemSucesso","Compra cadastrado com sucesso!");
			}else {
				dao.altera(compra);
				redirectAtt.addFlashAttribute("mensagemSucesso","Compra alterado com sucesso!");
			}			
		} catch(Exception e) {
			//aqui vai nossa mensagem de erro... vamos colocar no model!
			redirectAtt.addFlashAttribute("mensagemErro", "ERRO GRAVE: " + e.getMessage());
			
			
		}
		
		return "redirect:/compra";
		
	}
	@RequestMapping("/deleta/{id}")
	public String deleta(@PathVariable(name="id")int id,
						 RedirectAttributes redirectAtt) {
		
		Compra compra = dao.buscaPorId(Compra.class, id);
		dao.deleta(compra);
		redirectAtt.addFlashAttribute("mensagemSucesso","Compra deletado com sucesso!");
		return "redirect:/compra";
	}
	
	@RequestMapping("/altera/{id}")
	public String carregaAlterar(@PathVariable(name="id")int id, Model model) {
		
		model.addAttribute("compras", dao.buscaTodos(Compra.class));
		model.addAttribute("compra", dao.buscaPorId(Compra.class, id));
		return "compra";
	}


}
