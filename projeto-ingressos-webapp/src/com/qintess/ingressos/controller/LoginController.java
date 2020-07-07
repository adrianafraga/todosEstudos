package com.qintess.ingressos.controller;



import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.qintess.ingressos.dao.Dao;
import com.qintess.ingressos.entidade.Cliente;
import com.qintess.ingressos.entidade.Papel;



@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private Dao dao;
	
	/*
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping("/carregaRegistro")
	public String carregaRegistro() {
		return "registro";
	}
	
	@RequestMapping("/registra")
	public String registra(@ModelAttribute Cliente cliente,
						   RedirectAttributes redirectAtt,
						   HttpServletRequest req) {
		
		String senhaOriginal = cliente.getSenha();
		try {
			dao.buscaTodos(Cliente.class)
				.stream()
				.filter(a -> a.getEmail().equals(cliente.getEmail()))
				.findFirst()
				.get();
			
			redirectAtt.addFlashAttribute("mensagemErro", "Usuário já cadastrado no sistema");
			return "redirect:/login";
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		criaNovoCliente(cliente);
		
		UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(cliente.getEmail(), senhaOriginal);
	    authToken.setDetails(new WebAuthenticationDetails(req));
	     
	    Authentication authentication = authenticationManager.authenticate(authToken);
	     
	    SecurityContextHolder.getContext().setAuthentication(authentication);
		
		return "redirect:/";
	}
	
	private void criaNovoCliente(Cliente cliente) {
		PasswordEncoder passEncoder = new BCryptPasswordEncoder();
		String hashedPass = passEncoder.encode(cliente.getSenha());
		cliente.setSenha(hashedPass);
		
		dao.salva(cliente);
		
		List<Papel> papeis = new ArrayList<Papel>();
		Papel papel = new Papel();
		
		papel.setNome("USER");
		if(cliente.getNome().equals("admin")) {
			papel.setNome("ADMIN");
		}
		papel.setCliente(cliente);
		papeis.add(papel);
		
		//cliente.setPapeis(papeis);
		dao.salva(papel);
		
	}*/
}
