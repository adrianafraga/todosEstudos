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
import com.qintess.ingressos.entidade.CasaShow;


@Controller
@RequestMapping("/casashow")
public class CasaShowController {

	@Autowired
	private Dao dao;
	
	
	@RequestMapping("")
	public String carrega (Model model) {
		
		model.addAttribute("casashows", dao.buscaTodos(CasaShow.class));
		model.addAttribute("casashow", new CasaShow ());
		return "casashow";
			
	}
	
	@RequestMapping("/salva")
	public String salva(@ModelAttribute CasaShow casashow,
						@RequestParam(required=false, value="cancela") String cancela,
						RedirectAttributes redirectAtt) {
		
		try {
			if(cancela != null) {
				return "redirect:/casashow";
			}
			if(casashow.getId() == 0) {
				dao.salva(casashow);
				
				redirectAtt.addFlashAttribute("mensagemSucesso","Casa de show cadastrada com sucesso!");
			}else {
				dao.altera(casashow);
				redirectAtt.addFlashAttribute("mensagemSucesso","Casa de show alterada com sucesso!");
			}			
		} catch(Exception e) {
			//aqui vai nossa mensagem de erro... vamos colocar no model!
			redirectAtt.addFlashAttribute("mensagemErro", "ERRO GRAVE: " + e.getMessage());
			
			
		}
		
		return "redirect:/casashow";
		
	}
	@RequestMapping("/deleta/{id}")
	public String deleta(@PathVariable(name="id")int id,
						 RedirectAttributes redirectAtt) {
		
		CasaShow casashow = dao.buscaPorId(CasaShow.class, id);
		dao.deleta(casashow);
		redirectAtt.addFlashAttribute("mensagemSucesso","Casa de Show deletada com sucesso!");
		return "redirect:/casashow";
	}
	
	@RequestMapping("/altera/{id}")
	public String carregaAlterar(@PathVariable(name="id")int id, Model model) {
		
		model.addAttribute("casashows", dao.buscaTodos(CasaShow.class));
		model.addAttribute("casashow", dao.buscaPorId(CasaShow.class, id));
		return "casashow";
	}
}
